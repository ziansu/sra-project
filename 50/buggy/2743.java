@java.lang.Override
public java.lang.Object onRetainCustomNonConfigurationInstance() {
    android.util.Log.d(com.cookbook.fenix.cookbook.CookBOOK.TEST, ("mImageDownloader = " + (mImageDownloader.hashCode())));
    return mImageDownloader;
}