public com.android.volley.RequestQueue getRequestQueue() {
    if ((requestQueue) == null) {
        requestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.example.moreapp.App.getContext());
    }
    return requestQueue;
}