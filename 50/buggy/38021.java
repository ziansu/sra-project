@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.adleritech.android.developertest.application.DeveloperTestApplication.sInstance = this;
    android.content.Intent intent = new android.content.Intent(com.adleritech.android.developertest.application.DeveloperTestApplication.SERVICE_NAME);
    bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
    mBound = true;
}