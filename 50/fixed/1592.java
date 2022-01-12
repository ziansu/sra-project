public void addItemHereClicked(int position) {
    selectionManager.cancelSelectionMode();
    new igrek.todotree.controller.ItemEditorController().newItem(position);
}