@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.category.base.BaseApplication.sApplicationContext = this;
    mRequestQueueInstance = com.android.volley.toolbox.Volley.newRequestQueue(getBaseContext());
}