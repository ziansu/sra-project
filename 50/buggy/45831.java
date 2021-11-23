@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    if ((mException) != null) {
        mCallback.onError(mException);
    }else {
        mCallback.onUploadComplete();
    }
}