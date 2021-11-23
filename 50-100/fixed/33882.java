@java.lang.Override
public void onCreate() {
    super.onCreate();
    cn.xueximiao.tv.activity.MeowApplication.context = getApplicationContext();
    io.vov.vitamio.Vitamio.isInitialized(cn.xueximiao.tv.activity.MeowApplication.context);
    x.Ext.init(this);
    cn.xueximiao.tv.activity.MeowApplication.initImageLoader(this);
    com.orhanobut.logger.Logger.init(cn.xueximiao.tv.activity.MeowApplication.LOGTAG).logLevel(LogLevel.FULL);
    com.umeng.analytics.MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_ANALYTICS_OEM);
    com.umeng.analytics.MobclickAgent.enableEncrypt(false);
}