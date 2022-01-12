public void setPageLength(int pLength) {
    if ((pageLength) != pLength) {
        pageLength = pLength;
        page = (startIndex) / pLength;
        checkPageCount();
        grid.setHeightByRows(pLength);
        grid.setHeightMode(HeightMode.ROW);
        if (!(setStartIndex())) {
            fireItemSetChange();
        }
    }
}