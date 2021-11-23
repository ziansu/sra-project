public void deleteToolTestDataInputFile() {
    listStore.commitChanges();
    java.lang.String deleteInput = grid.getSelectionModel().getSelectedItem();
    if (deleteInput != null) {
        listStore.remove(listStore.findModelWithKey(deleteInput));
    }
}