private void onClickValidate(org.json.JSONObject object) {
    java.lang.String currentNotificationId = "";
    try {
        currentNotificationId = object.getString("idNotification");
    } catch (org.json.JSONException e) {
        android.util.Log.e(e.getClass().getName(), "JSONException", e);
    }
    new com.example.celien.drivemycar.http.HttpAsyncNotif(this).execute(Action.UPDATE_REQUEST_STATE.toString(), currentNotificationId, Action.CONFIRM_RENT.toString());
    list.remove(object);
}