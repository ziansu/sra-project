public void record(io.github.mthli.knife.history.action.Action action) {
    if (enabled) {
        if ((stateChangeListener) != null) {
            if (!(redoActionStack.isEmpty())) {
                stateChangeListener.onRedoEnabledStateChange(false);
            }
            if (undoActionStack.isEmpty()) {
                stateChangeListener.onUndoEnabledStateChange(true);
            }
        }
        redoActionStack.clear();
        undoActionStack.push(action);
    }
}