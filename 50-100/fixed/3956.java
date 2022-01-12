@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.Void... params) {
    android.content.Context context = mContext.get();
    if (context != null) {
        try {
            org.kontalk.util.MediaStorage.cacheThumbnail(context, mLocalUri, mPreviewFile, false);
            return true;
        } catch (java.lang.Exception e) {
            org.kontalk.Log.e(org.kontalk.ui.view.ImageContentView.TAG, "unable to generate thumbnail", e);
        }
    }
    return false;
}