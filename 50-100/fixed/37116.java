@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... params) {
    java.lang.String responseString = null;
    try {
        responseString = com.example.collin.contactstest.utilities.NetworkUtils.getResponseFromHttpUrl();
    } catch (java.lang.Exception e) {
        android.util.Log.d("JSONRET", "shoot");
        e.printStackTrace();
    }
    return responseString;
}