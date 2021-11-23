public void undoPrevious() {
    if ((undoStack.size()) >= 2) {
        java.util.ArrayList<main.java.data.Task> currentState = undoStack.pop();
        redoStack.push(currentState);
        taskList = new java.util.ArrayList<main.java.data.Task>(undoStack.peek());
        permStorage.copyAllToFile(taskList);
        isPreviousUndo = true;
    }
}