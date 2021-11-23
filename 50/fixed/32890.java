@java.lang.Override
public void onCompleted(org.json.JSONObject object, com.facebook.GraphResponse response) {
    if (object != null) {
        android.util.Log.i(MY_LOG, ("jsonObject=" + (object.toString())));
        jsonResponse = object;
    }
}