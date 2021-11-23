@java.lang.Override
public void onLoadingFailed(java.lang.String imageUri, android.view.View view, com.nostra13.universalimageloader.core.assist.FailReason failReason) {
    me.ccrama.redditslide.util.LogUtil.v(("Loading failed because " + (failReason.getCause().getMessage())));
}