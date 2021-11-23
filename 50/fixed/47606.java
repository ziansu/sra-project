public com.android.volley.RequestQueue getRequestQueue() {
    if ((mRequestQueue) == null) {
        mRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(getApplicationContext());
        mRequestQueue.start();
    }
    return mRequestQueue;
}