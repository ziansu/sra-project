public java.util.ArrayList<logic.Task> redo() {
    if (!(redoStack.isEmpty())) {
        java.util.ArrayList<logic.Task> previousState = redoStack.pop();
        undoStack.push(previousState);
        return undoStack.peek();
    }
    return initialState;
}