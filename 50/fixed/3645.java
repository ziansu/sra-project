private void focusIndex(int index) {
    contentListView.getSelectionModel().select(index);
    contentListView.scrollTo(index);
    numberListView.scrollTo(index);
}