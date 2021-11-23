public void remove(java.lang.String collectionName, java.lang.String documentId, im.delight.android.ddp.ResultListener listener) {
    java.util.HashMap query = new java.util.HashMap();
    query.put("_id", documentId);
    if (listener != null) {
        mMeteor.insert(collectionName, query);
    }else {
        if (this.hasNetworkConnection) {
            mMeteor.insert(collectionName, query, listener);
        }else {
            listener.onError("Error", "Please Check your network Connection", "");
        }
    }
}