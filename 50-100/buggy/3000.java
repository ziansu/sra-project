@java.lang.Override
public void run() {
    if ((activities.size()) > 0) {
        populateList(activities, ownCloudClient);
        swipeEmptyListRefreshLayout.setVisibility(View.GONE);
        swipeListRefreshLayout.setVisibility(View.VISIBLE);
    }else {
        setEmptyContent(noResultsHeadline, noResultsMessage);
    }
}