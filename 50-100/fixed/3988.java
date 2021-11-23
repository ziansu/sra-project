public boolean getWaterlooInfoSessions(final com.sixbynine.infosessions.data.ResponseHandler<com.sixbynine.infosessions.model.WaterlooInfoSessionCollection> callback) {
    com.sixbynine.infosessions.model.WaterlooInfoSessionCollection collection = mWaterlooInfoSessionCollection;
    if (collection != null) {
        callbackSuccess(callback, collection);
        return true;
    }
    collection = mInfoSessionDBManager.getWaterlooSessions();
    if (collection != null) {
        collection.sort();
        mPermalinks = mInfoSessionDBManager.getPermalinks();
        mWaterlooInfoSessionCollection = collection;
        callbackSuccess(callback, collection);
        return true;
    }
    mWaterlooSessionsCallback.addCallback(callback);
    return false;
}