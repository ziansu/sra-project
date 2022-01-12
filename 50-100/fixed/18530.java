private void initUmengShare() {
    com.umeng.socialize.PlatformConfig.setWeixin(ConstantValues.WECHAT_ID, ConstantValues.WECHAT_SECRET);
    com.umeng.socialize.PlatformConfig.setSinaWeibo(ConstantValues.SINA_KEY, ConstantValues.SINA_SECRET);
    com.umeng.socialize.PlatformConfig.setQQZone(ConstantValues.TENCENT_ID, ConstantValues.TENCENT_SECRET);
    com.umeng.socialize.Config.REDIRECT_URL = com.ganxin.doingdaily.common.constants.ConstantValues.SINA_REDIRECT_URL;
    com.umeng.socialize.Config.DEBUG = com.ganxin.doingdaily.BuildConfig.DEBUG;
    com.umeng.socialize.Config.isJumptoAppStore = true;
    com.umeng.socialize.UMShareAPI.get(com.ganxin.doingdaily.application.DoingDailyApp.appContext);
}