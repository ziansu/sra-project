@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    android.util.Log.d("DEBUG", response.toString());
    try {
        java.util.List<com.hhua.android.producthunt.models.Notification> notificationsList = com.hhua.android.producthunt.models.Notification.fromJSONArray(response.getJSONArray("notifications"));
        notificationsArrayAdapter.addAll(notificationsList);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}