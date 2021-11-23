private void initDisplay() {
    _displayController = _mainController.getDisplayController();
    urgenda.util.StateFeedback state = retrieveStartupState();
    _displayController.initDisplay(state.getAllTasks(), createDisplayHeader(state), state.getDetailedIndexes(), state.getDisplayPosition(), true);
    _displayController.setMain(this);
}