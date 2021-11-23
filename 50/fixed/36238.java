public void refresh() {
    photoListPresenter.load();
    previousTotal = 0;
    firstVisibleItem = 0;
    visibleItemCount = 0;
    totalItemCount = 0;
}