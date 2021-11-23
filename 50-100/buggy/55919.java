@java.lang.Override
public void onCreate() {
    super.onCreate();
    net.qiujuer.tips.factory.model.Model.log(net.qiujuer.tips.factory.service.MissService.TAG, "onCreate");
    android.app.Application application = getApplication();
    net.qiujuer.tips.factory.model.Model.setApplication(application);
    mBinder = new net.qiujuer.tips.factory.service.MissService.MissServiceImpl(application);
    mReceiver = new net.qiujuer.tips.factory.service.MissService.MissServiceBroadcastReceiver();
    try {
        android.content.IntentFilter filter = new android.content.IntentFilter();
        filter.addAction(net.qiujuer.tips.factory.service.MissService.ACTION_MISS_WIDGET_REFRESH);
        application.registerReceiver(mReceiver, filter);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    addAlarm(getApplication());
}