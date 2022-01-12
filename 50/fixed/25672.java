private void handleIntent(android.content.Intent intent) {
    com.sina.weibo.sdk.api.share.IWeiboShareAPI api = mIShareWeiboHelper.getIWeiboShareAPI();
    if (api != null) {
        api.handleWeiboResponse(intent, this);
    }
}