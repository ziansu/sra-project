@java.lang.Override
public void onCreate() {
    setStrictMode();
    super.onCreate();
    com.aspsine.zhihu.daily.App.applicationContext = getApplicationContext();
    initImageLoader(getApplicationContext());
}