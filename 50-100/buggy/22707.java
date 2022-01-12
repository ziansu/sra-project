@java.lang.Override
public void onCompleted(java.lang.Exception e, com.google.gson.JsonObject jsonObject) {
    if (jsonObject == null) {
        java.lang.String severResponse = jsonObject.get("response").getAsString();
        if (severResponse.equals("OK")) {
            android.widget.Toast.makeText(mActivity, "Server not responding. Try again later.", Toast.LENGTH_SHORT).show();
            android.util.Log.e(org.app.chatup.GCM.GCMRegisterTask.TAG, ("Server didn't register device. Server response: " + severResponse));
            return ;
        }
    }
}