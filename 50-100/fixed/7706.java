private void close() {
    android.content.Intent intent = new android.content.Intent("android.location.GPS_ENABLED_CHANGE");
    intent.putExtra("enabled", false);
    sendBroadcast(intent);
    if ((service) != null) {
        unregisterReceiver(service);
    }
    if ((id) != (-1)) {
        workWithDataBase.onlineEnd(id);
    }
    finish();
    startActivity(new android.content.Intent(this, com.example.hjk.testing.MainActivity.class));
}