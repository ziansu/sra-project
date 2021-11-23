@java.lang.Override
public void sendLocalNotification(com.codename1.notifications.LocalNotification n) {
    com.codename1.impl.ios.IOSImplementation.nativeInstance.sendLocalNotification(n.getId(), n.getAlertTitle(), n.getAlertBody(), n.getAlertSound(), n.getBadgeNumber(), n.getFireDate(), n.getRepeatType());
}