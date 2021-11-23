@java.lang.Override
public void onComplete(int status, java.lang.String desc, java.io.File file) {
    try {
        msgJsonArr.put(getMessageJSONObject(msg));
        fireEvent("onSyncOfflineMessage", json.toString());
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}