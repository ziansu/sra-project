@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mApp = ((com.cloud.BaseApplication) (getApplication()));
    gson = mApp.getGson();
}