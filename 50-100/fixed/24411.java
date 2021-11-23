public void endLoadingMore() {
    if ((loaderView) != null) {
        scrollTo(0, 0);
        android.view.View childView = contentView.getChildAt(1);
        contentView.scrollBy(0, (((childView.getHeight()) + (ITEM_DIVIDE_SIZE)) + 1));
        isLoadingMore = false;
    }
}