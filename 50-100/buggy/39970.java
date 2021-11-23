@java.lang.Override
public void run() {
    if ((notifications.size()) > 0) {
        populateList(notifications);
        swipeEmptyListRefreshLayout.setVisibility(View.GONE);
        swipeListRefreshLayout.setVisibility(View.VISIBLE);
    }else {
        setEmptyContent(noResultsHeadline, noResultsMessage);
    }
}