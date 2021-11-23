private java.lang.String activateDemoScreen() {
    _mainController.setDemo(true);
    urgenda.util.StateFeedback state = new urgenda.util.DemoStateFeedback();
    _displayController.setSelectedTaskByCall(0, true);
    _displayController.setDisplay(state.getAllTasks(), createDisplayHeader(state), state.getDetailedIndexes(), state.getDisplayPosition(), true, false, true);
    _mainController.updateOverdueCount(state.getOverdueCount());
    return state.getFeedback();
}