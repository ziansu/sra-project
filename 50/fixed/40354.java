public void removeLastPage() {
    if ((mPageCount) == 0) {
        return ;
    }
    (mPageCount)--;
    notifyDataSetChanged();
}