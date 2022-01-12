@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.arsalan.garage.GarageApp.sGarageApp = this;
    if (((com.arsalan.garage.utils.FlavorConstants.BUILD_TYPE) == (com.arsalan.garage.utils.AppConstants.BUILD_TYPE_DEVELOPMENT)) && ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.GINGERBREAD))) {
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        android.os.StrictMode.setVmPolicy(new android.os.StrictMode.VmPolicy.Builder().detectAll().penaltyDeath().build());
    }
    initImageLoader(this);
    initLoaderHandler(this);
}