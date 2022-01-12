public boolean undo() {
    if (previousState.empty()) {
        return false;
    }else {
        currentList = getTasks();
        redoList = getTasks();
        redoStack.push(redoList);
        previousList = previousState.peek();
        tasks.setAll(previousState.pop());
        try {
            io.saveToFile(tasks);
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
            printError("IO Exception");
            return false;
        }
        return true;
    }
}