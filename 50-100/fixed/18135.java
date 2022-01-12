@java.lang.Override
public void onCreate() {
    super.onCreate();
    cn.jpush.android.api.JPushInterface.setDebugMode(false);
    cn.jpush.android.api.JPushInterface.init(this);
    if ((getApplicationInfo().packageName.equals(com.gimletech.value.MainApplication.getCurProcessName(getApplicationContext()))) || ("io.rong.push".equals(com.gimletech.value.MainApplication.getCurProcessName(getApplicationContext())))) {
        io.rong.imlib.RongIMClient.init(this);
    }
}