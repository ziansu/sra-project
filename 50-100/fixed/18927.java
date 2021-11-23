@java.lang.Override
public void onCreate() {
    super.onCreate();
    final com.adenda.plugin.urbanairship.AdendaUrbanAirshipNotificationFactory factory = new com.adenda.plugin.urbanairship.AdendaUrbanAirshipNotificationFactory(this);
    factory.setColor(getResources().getColor(R.color.color_primary));
    factory.setSmallIconId(R.drawable.ic_notification);
    com.urbanairship.UAirship.takeOff(this, new com.urbanairship.UAirship.OnReadyCallback() {
        @java.lang.Override
        public void onAirshipReady(com.urbanairship.UAirship airship) {
            airship.getPushManager().setNotificationFactory(factory);
            com.adenda.plugin.urbanairship.AdendaLockscreenAction.register();
        }
    });
    com.urbanairship.UAirship.shared().getPushManager().setUserNotificationsEnabled(true);
}