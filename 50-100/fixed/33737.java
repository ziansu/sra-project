public void updatePointer(int num) {
    if (num >= (getActiveListView().getItems().size()))
        num -= 1;
    
    getActiveListView().requestFocus();
    getActiveListView().getSelectionModel().select(num);
    getActiveListView().scrollTo(getActiveListView().getSelectionModel().getSelectedIndex());
}