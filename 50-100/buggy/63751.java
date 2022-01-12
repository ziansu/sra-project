@java.lang.Override
public void onComplete(int status, java.lang.String desc, java.io.File file) {
    if (status == 0) {
        try {
            msgJsonArr.put(getMessageJSONObject(msg));
            json.put("messageList", msgJsonArr);
            fireEvent("onSyncOfflineMessage", json.toString());
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
}