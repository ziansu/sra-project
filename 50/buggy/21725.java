@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.greenrobot.eventbus.EventBus.getDefault().register(this);
    initTask();
}