@java.lang.Override
public void onHostDestroy() {
    com.onesignal.OneSignal.removeNotificationOpenedHandler();
    com.onesignal.OneSignal.removeNotificationReceivedHandler();
}