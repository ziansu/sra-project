private void startService() {
    android.util.Log.d(com.sms.reading.MainActivity.TAG, "Service started");
    android.content.Intent walnutServiceIntent = new android.content.Intent(this, com.sms.reading.service.SMSReadService.class);
    walnutServiceIntent.setAction("walnut.service.NEW_DATA");
    walnutServiceIntent.putExtra("walnut.service.timestamp", ((long) (0)));
    walnutServiceIntent.putExtra("walnut.service.mode", 1);
    startService(walnutServiceIntent);
}