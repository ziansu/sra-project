private void updateRedoStack(java.util.Stack<seedu.malitio.model.history.InputHistory> history) {
    model.getFuture().push(history.pop());
}