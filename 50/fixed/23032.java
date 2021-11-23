public void refreshGrid() {
    if ((getListView().getListGrid()) != null) {
        getListView().getListGrid().setVisibleRangeAndClearData(getListView().getListGrid().getVisibleRange(), true);
    }
}