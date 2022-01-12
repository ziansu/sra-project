@java.lang.Override
public void openArticleWebUrl(final java.lang.String contentUrl) {
    android.content.Intent intent = info.hossainkhan.android.core.util.ActivityUtils.provideOpenWebUrlIntent(contentUrl);
    if ((intent.resolveActivity(mApplicationContext.getPackageManager())) != null) {
        mApplicationContext.startActivity(intent);
    }else {
        java.lang.String logMsg = "App does not have browser to show URL: %s.";
        timber.log.Timber.w(logMsg, contentUrl);
        com.google.firebase.crash.FirebaseCrash.log(logMsg);
    }
}