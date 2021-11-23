@android.support.annotation.Nullable
public com.taobao.weex.WXSDKInstance takeCachedInstance(@android.support.annotation.Nullable
java.lang.String targetUrl) {
    if (!(mRemoteConfig.isSwitchOn())) {
        com.taobao.weex.utils.WXLogUtils.d(com.taobao.weex.appfram.prerender.PreRenderManager.TAG, "takeCachedInstance failed. switch is off");
        return null;
    }
    if (android.text.TextUtils.isEmpty(targetUrl)) {
        return null;
    }
    com.taobao.weex.appfram.prerender.IPreRenderCache.Entry entry = mInternalCache.remove(targetUrl);
    if (((entry != null) && ((entry.data) != null)) && (entry.isFresh())) {
        return entry.data;
    }else {
        return null;
    }
}