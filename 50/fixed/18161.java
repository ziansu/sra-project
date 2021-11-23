@java.lang.Override
public void playDefaultNotificationSound() {
    com.jdndeveloper.lifereminders.phone.Phone.notification = android.media.RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
    com.jdndeveloper.lifereminders.phone.Phone.r = android.media.RingtoneManager.getRingtone(com.jdndeveloper.lifereminders.phone.Phone.context, com.jdndeveloper.lifereminders.phone.Phone.notification);
    com.jdndeveloper.lifereminders.phone.Phone.r.play();
}