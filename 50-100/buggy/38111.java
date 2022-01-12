public java.lang.String setPage(int page, int num) {
    if ((page > 0) && (page <= (numberOfPages))) {
        currentPage = page;
    }
    return java.lang.String.valueOf(startVals[((currentPage) - 1)]);
}