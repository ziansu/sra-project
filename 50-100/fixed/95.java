public long getLastPageNumber(long pageLimit) {
    long numberOfPages = (this.totalItems) / (com.devoo.kim.api.naver.NaverCafeAPI.pageSize);
    numberOfPages = (((this.totalItems) % (com.devoo.kim.api.naver.NaverCafeAPI.pageSize)) > 0) ? ++numberOfPages : numberOfPages;
    if (numberOfPages < pageLimit) {
        return numberOfPages - 1;
    }
    return pageLimit - 1;
}