public void pushUndoableAction(actions.edit.undoredo.UndoRedoableInterface undoredoableAction) {
    undoStack.push(undoredoableAction);
    redoStack.clear();
    if ((delegate) != null) {
        delegate.didAddNewAction(undoredoableAction);
    }
}