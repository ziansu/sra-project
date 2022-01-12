public void goBackToPage(int pageIndex, boolean clearSelection) {
    if ((pageIndex < 0) || (pageIndex >= ((mPageCount) - 1))) {
        return ;
    }
    mPageCount = pageIndex + 1;
    notifyDataSetChanged();
}