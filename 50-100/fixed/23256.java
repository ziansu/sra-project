protected javax.persistence.filter.PageFilter<E> doFilter(javax.persistence.filter.Filter<E> filter, int page, int pageSize) {
    try {
        if ((this.currentPage) < 1) {
            this.currentPage = 1;
        }
        int initial = (page - 1) * pageSize;
        initial = (initial >= 0) ? initial : 0;
        return filterService.filter(filter, initial, pageSize);
    } catch (javax.persistence.filter.exception.OffsetOutOfRangeException e) {
        this.currentPage = 1;
        return doFilter(filter, currentPage, pageSize);
    }
}