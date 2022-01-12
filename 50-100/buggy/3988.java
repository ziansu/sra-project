public void getWaterlooInfoSessions(final com.sixbynine.infosessions.data.ResponseHandler<com.sixbynine.infosessions.model.WaterlooInfoSessionCollection> callback) {
    com.sixbynine.infosessions.model.WaterlooInfoSessionCollection collection = mWaterlooInfoSessionCollection;
    if (collection != null) {
        callbackSuccess(callback, collection);
        return ;
    }
    collection = mInfoSessionDBManager.getWaterlooSessions();
    if (collection != null) {
        collection.sort();
        mPermalinks = mInfoSessionDBManager.getPermalinks();
        mWaterlooInfoSessionCollection = collection;
        callbackSuccess(callback, collection);
        return ;
    }
    mWaterlooSessionsCallback.addCallback(callback);
}