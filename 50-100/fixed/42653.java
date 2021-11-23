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
    if ((realmResults) != null) {
        io.realm.RealmBasedRecyclerViewAdapter.notifyDataSetChanged();
    }
}