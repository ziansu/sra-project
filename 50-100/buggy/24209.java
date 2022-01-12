@java.lang.Override
public void setSharedIntent(java.lang.String text) {
    android.content.Intent sharedIntent = com.jagr.android.popularmovies.util.Utility.createSharedIntent(text);
    if (null != sharedIntent) {
        mShareActionProvider.setShareIntent(sharedIntent);
    }else {
        android.util.Log.d(com.jagr.android.popularmovies.MainActivity.LOG_TAG, ("sharedIntent is null" + sharedIntent));
    }
}