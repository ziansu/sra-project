protected T extractObjectFromResults(io.realm.RealmResults<T> results) {
    return results.isEmpty() ? null : results.last();
}