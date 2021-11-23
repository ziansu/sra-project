@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.fjg.android.zxing.ZxingApplication.mInstance = this;
    cn.jpush.android.api.JPushInterface.setDebugMode(false);
    cn.jpush.android.api.JPushInterface.init(this);
}