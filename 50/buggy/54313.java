@java.lang.Override
public void onErrorResponse(com.android.volley.VolleyError error) {
    android.util.Log.e(com.example.imac.samplemap.data.AsyncLoadVolley.TAG, ("onErrorResponse : " + (error.getMessage())));
    asyncTaskListener.onTaskComplete(false, error.getMessage());
}