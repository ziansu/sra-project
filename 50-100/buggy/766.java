private void initWeixinShare(android.content.Context context) {
    mIWXAPI = com.tencent.mm.sdk.openapi.WXAPIFactory.createWXAPI(context, mWeChatAppId, true);
    if (!(mIWXAPI.isWXAppInstalled())) {
        android.widget.Toast.makeText(context, context.getString(R.string.share_install_wechat_tips), Toast.LENGTH_SHORT).show();
        return ;
    }else {
        mIWXAPI.registerApp(mWeChatAppId);
    }
}