public CommandDetails undo() {
    if (undoStack.isEmpty()) {
        return null;
    }else {
        CommandDetails latest = undoStack.pop();
        switch (latest.getCommand()) {
            case UPDATE :
                CommandDetails old = undoStack.pop();
                redoStack.push(latest);
                redoStack.push(old);
                return old;
            default :
                redoStack.push(latest);
                return latest;
        }
    }
}