public void addItemHereClicked(int position) {
    lock.assertUnlocked();
    selectionManager.cancelSelectionMode();
    new igrek.todotree.controller.ItemEditorController().newItem(position);
}