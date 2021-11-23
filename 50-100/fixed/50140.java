public void insert(java.lang.String collectionName, java.util.HashMap<java.lang.String, java.lang.Object> values, im.delight.android.ddp.ResultListener listener) {
    if (listener != null) {
        if (this.hasNetworkConnection) {
            mMeteor.insert(collectionName, values, listener);
        }else {
            listener.onError("Error", "Please Check your network Connection", "");
        }
    }else {
        mMeteor.insert(collectionName, values);
    }
}