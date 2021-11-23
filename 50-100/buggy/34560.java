@java.lang.Override
public void onSuccess(int statusCode, org.apache.http.Header[] headers, org.json.JSONObject object) {
    super.onSuccess(statusCode, headers, object);
    resetBookingTicketData();
    showTips(this, R.string.register_success, false);
    dialog.hide();
    android.content.Intent intent = new android.content.Intent(this, com.example.fengge.shuttlebus.UserInfoActivity.class);
    startActivity(intent);
}