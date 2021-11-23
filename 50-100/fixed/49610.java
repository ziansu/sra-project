@java.lang.Override
public void call(java.lang.Object... args) {
    try {
        org.json.JSONObject resultJson = ((org.json.JSONObject) (args[0]));
        org.json.JSONObject contentJson = new org.json.JSONObject(analyzer.extractContentFromReceivedJson(resultJson));
        boolean requestSuccess = contentJson.getBoolean("requestSuccess");
        if (requestSuccess)
            android.util.Log.d("Awesometic", "signupRequest - Success");
        else
            android.util.Log.d("Awesometic", "signupRequest - Fail - Something Wrong");
        
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        android.util.Log.d("Awesometic", "signupRequest - JSONException");
    }
}