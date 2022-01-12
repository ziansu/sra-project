@java.lang.Override
public void run() {
    populateList(activities, ownCloudClient);
    if ((activities.size()) > 0) {
        swipeEmptyListRefreshLayout.setVisibility(View.GONE);
        swipeListRefreshLayout.setVisibility(View.VISIBLE);
    }else {
        setEmptyContent(noResultsHeadline, noResultsMessage);
        swipeListRefreshLayout.setVisibility(View.GONE);
        swipeEmptyListRefreshLayout.setVisibility(View.VISIBLE);
    }
}