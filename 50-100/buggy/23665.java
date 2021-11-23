@android.annotation.TargetApi(value = Build.VERSION_CODES.O)
public void createMinervaAnnouncementChannel() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.O)) {
        return ;
    }
    java.lang.String channelName = context.getString(R.string.channel_minerva_announcements);
    java.lang.String channelDescription = context.getString(R.string.channel_minerva_announcements_desc);
    android.app.NotificationChannel channel = new android.app.NotificationChannel(be.ugent.zeus.hydra.data.ChannelCreator.MINERVA_ANNOUNCEMENT_CHANNEL, channelName, android.app.NotificationManager.IMPORTANCE_DEFAULT);
    channel.setDescription(channelDescription);
    channel.enableLights(true);
    notificationManager.createNotificationChannel(channel);
}