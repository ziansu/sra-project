public void updatePointer(int num) {
    java.lang.System.out.println(getActiveListView().getItems().size());
    if (num >= (getActiveListView().getItems().size()))
        num -= 1;
    
    getActiveListView().requestFocus();
    getActiveListView().getSelectionModel().select(num);
    getActiveListView().scrollTo(getActiveListView().getSelectionModel().getSelectedIndex());
}