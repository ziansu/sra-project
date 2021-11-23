@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.util.Pair<java.util.Set<java.lang.Integer>, java.util.List<be.ugent.zeus.hydra.models.cards.HomeCard>>> l, android.util.Pair<java.util.Set<java.lang.Integer>, java.util.List<be.ugent.zeus.hydra.models.cards.HomeCard>> data) {
    android.util.Log.i(be.ugent.zeus.hydra.fragments.home.HomeFeedFragment.TAG, "Finished loading data");
    if (wasCached) {
        for (java.lang.Integer error : data.first) {
            onPartialError(error);
        }
        adapter.onDataUpdated(new java.util.ArrayList(data.second), null);
    }
    wasCached = true;
    shouldRefresh = false;
    swipeRefreshLayout.setRefreshing(false);
}