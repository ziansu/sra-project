private void handleDeleteKey() {
    controller.parseCommand((((main.ui.RootLayoutController.COMMAND_DELETE) + (main.ui.RootLayoutController.WHITESPACE)) + ((getSelectedTaskIndex()) + 1)), Controller.FLOATING_TAB);
    controller.executeCommand();
    saveSelectedTaskIndex();
    refreshListView();
    restoreListViewPreviousSelection();
    showUndoRedoButton();
}