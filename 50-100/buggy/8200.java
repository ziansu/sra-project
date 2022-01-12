@java.lang.Override
public void call(java.lang.String s) {
    if (!(android.text.TextUtils.isEmpty(s))) {
        if (platform == (me.shaohui.shareutil.share.SharePlatform.QZONE)) {
            shareToQZoneForMedia(title, targetUrl, summary, s, activity, listener);
        }else {
            shareToQQForMedia(title, targetUrl, summary, s, activity, listener);
        }
    }else {
        startFailed(activity, listener, new java.lang.Exception("image fetch error"));
    }
}