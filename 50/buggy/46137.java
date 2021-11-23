public void addItem(int pageIndex, int itemIndex, T2 t2) {
    data.get(pageIndex).getData().add(itemIndex, t2);
    refreshDragViewPager();
    getDraggedViewPager().scrollToPageBottom(pageIndex);
}