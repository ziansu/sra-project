private void handleDeleteKey() {
    controller.parseCommand((((main.ui.RootLayoutController.COMMAND_DELETE) + (main.ui.RootLayoutController.WHITESPACE)) + (getSelectedTaskIndex())), Controller.FLOATING_TAB);
    controller.executeCommand();
    saveSelectedTaskIndex();
    refreshListView();
    restoreListViewPreviousSelection();
    showUndoRedoButton();
}