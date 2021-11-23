private void undo() {
    if ((undoStack.size()) > 1) {
        redoStack.push(undoStack.pop());
        showImage(undoStack.peek(), false);
    }
}