@java.lang.Override
public void onCreate() {
    super.onCreate();
    if (!(BuildConfig.MOBILE_CENTER_KEY.equalsIgnoreCase("null")))
        com.microsoft.azure.mobile.MobileCenter.start(this, BuildConfig.MOBILE_CENTER_KEY, com.microsoft.azure.mobile.analytics.Analytics.class, com.microsoft.azure.mobile.crashes.Crashes.class, com.microsoft.azure.mobile.distribute.Distribute.class);
    
}