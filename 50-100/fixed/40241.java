public void settings_init(java.lang.String connectedXmppUser) {
    if (!(com.recoverrelax.pt.riotxmppchat.Database.RiotXmppDBRepository.defaultSettingsNotificationsSetted(connectedXmppUser))) {
        LolChatRiotDb.NotificationDb notif = new LolChatRiotDb.NotificationDb(null, connectedXmppUser, true, true, true, true);
        com.recoverrelax.pt.riotxmppchat.Database.RiotXmppDBRepository.insertNotification(notif);
        com.recoverrelax.pt.riotxmppchat.MyUtil.google.LogUtils.LOGI(com.recoverrelax.pt.riotxmppchat.MainApplication.TAG, "Setting NotificationDefaults for the first time");
    }else {
        com.recoverrelax.pt.riotxmppchat.MyUtil.google.LogUtils.LOGI(com.recoverrelax.pt.riotxmppchat.MainApplication.TAG, "NotificationDefaults already setted");
    }
}