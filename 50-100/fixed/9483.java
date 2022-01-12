@java.lang.Override
public void onResponse(java.lang.String jsonString) {
    try {
        com.example.ssteeve.dpd_android.DPDUser.login(endPoint, username, password, mappableObject, callBack);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
        callBack.onFailure(null, null, e);
    }
}