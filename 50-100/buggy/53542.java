@java.lang.Override
public boolean redo() {
    if (redoStack.empty()) {
        return false;
    }else {
        previousState.push(previousList);
        tasks.setAll(redoStack.pop());
        try {
            io.saveToFile(tasks);
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
            printError("IO Exception");
        }
        return true;
    }
}