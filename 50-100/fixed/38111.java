public java.lang.String setPage(int page, int num) {
    if ((page > 0) && (page <= (numberOfPages))) {
        currentPage = page;
    }else
        if (page <= 0) {
            currentPage = 1;
        }else {
            currentPage = numberOfPages;
        }
    
    return java.lang.String.valueOf(startVals[((currentPage) - 1)]);
}