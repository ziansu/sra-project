private void undo() {
    if ((undoStack.size()) > 0) {
        redoStack.push(undoStack.pop());
        showImage(undoStack.pop());
    }
}