public void nextPdfPage() {
    int next = (mCurrentPage.getIndex()) + 1;
    if ((next < (getPageCount())) && (next >= 0)) {
        showPage(next);
    }
}