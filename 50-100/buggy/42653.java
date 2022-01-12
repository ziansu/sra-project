public void updateRealmResults(io.realm.RealmResults<T> queryResults) {
    if (((listener) != null) && ((realmResults) != null)) {
        realmResults.removeChangeListener(listener);
    }
    realmResults = queryResults;
    if (((listener) != null) && ((realmResults) != null)) {
        realmResults.addChangeListener(listener);
    }
    updateRowWrappers();
    ids = getIdsOfRealmResults();
    io.realm.RealmBasedRecyclerViewAdapter.notifyDataSetChanged();
}