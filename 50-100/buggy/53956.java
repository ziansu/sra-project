@java.lang.Override
public boolean onLoadMore(int page, int totalItemsCount) {
    if (actionFocus) {
        fetchReports(5, page, complexQuery, false, false);
    }else {
        fetchReports(5, page, buildQuery(true, "report", null), false, false);
    }
    return true;
}