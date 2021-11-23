public void restartService() {
    android.content.Intent intent = new android.content.Intent(getApplication(), pl.dom133.dzwonek.Notification_Service.class);
    intent.setAction("ACTION_STOP");
    startService(intent);
    startService(new android.content.Intent(getApplication(), pl.dom133.dzwonek.Notification_Service.class));
}