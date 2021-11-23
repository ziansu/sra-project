private void doShare(com.liulishuo.share.content.ShareContent shareContent) {
    java.lang.String appId = ShareBlock.Config.qqAppId;
    if (android.text.TextUtils.isEmpty(appId)) {
        throw new java.lang.NullPointerException("请通过shareBlock初始化QQAppId");
    }
    com.tencent.tauth.Tencent tencent = com.tencent.tauth.Tencent.createInstance(appId, getApplicationContext());
    if (isToFriend) {
        android.os.Bundle params = createQQBundle(shareContent);
        tencent.shareToQQ(this, params, uiListener);
    }else {
        android.os.Bundle params = createQZoneBundle(shareContent);
        tencent.shareToQzone(this, params, uiListener);
    }
}