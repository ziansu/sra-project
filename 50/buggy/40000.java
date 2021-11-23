@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.idonans.acommon.App.init(new com.idonans.acommon.App.Config.Builder().setContext(this).setBuildConfigAdapter(new com.idonans.acommon.demo.BuildConfigAdapterImpl()).build());
}