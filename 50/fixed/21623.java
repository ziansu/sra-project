@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.raizlabs.android.dbflow.config.FlowManager.init(new com.raizlabs.android.dbflow.config.FlowConfig.Builder(this).build());
}