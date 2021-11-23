@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    if (BuildConfig.DEBUG) {
        android.os.StrictMode.setVmPolicy(new android.os.StrictMode.VmPolicy.Builder().detectAll().penaltyLog().penaltyDeath().build());
    }
    super.onCreate(savedInstanceState);
    super.init();
    android.content.Intent intent = getIntent();
    if (isEvothingsIntent(intent)) {
        openEvothingsIntent(intent);
    }else {
        super.loadUrl(com.evothings.evothingsviewer.Config.getStartUrl());
    }
}