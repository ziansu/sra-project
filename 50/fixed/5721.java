@java.lang.Override
public void onCreate() {
    super.onCreate();
    mRequestQueueInstance = com.android.volley.toolbox.Volley.newRequestQueue(getBaseContext());
}