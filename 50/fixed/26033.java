private void prevPdfPage() {
    int prev = (mCurrentPage.getIndex()) - 1;
    if ((prev < (getPageCount())) && (prev >= 0)) {
        showPage(prev);
    }
}