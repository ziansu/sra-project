public void redoPrevious() {
    if ((isPreviousUndo) == false) {
        redoStack.clear();
    }
    if ((redoStack.size()) != 0) {
        java.util.ArrayList<main.java.data.Task> currentState = new java.util.ArrayList<main.java.data.Task>(redoStack.pop());
        undoStack.push(currentState);
        taskList = new java.util.ArrayList<main.java.data.Task>(currentState);
        permStorage.copyAllToFile(taskList);
    }
}