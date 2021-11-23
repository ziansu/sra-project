@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    super.onPostExecute(result);
    if ((mException) != null) {
        mCallback.onError(mException);
    }else {
        mCallback.onUploadComplete();
    }
}