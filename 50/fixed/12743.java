protected void onHandleIntent() {
    android.content.Intent in = new android.content.Intent(com.ford.mobileweather.smartdevicelink.features.WeatherAlertService.ACTION);
    in.putExtra("resultCode", Activity.RESULT_OK);
    in.putExtra("Alert", speakString);
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(in);
}