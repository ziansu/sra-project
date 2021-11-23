@java.lang.Override
public com.bitdubai.fermat_android_api.engine.NotificationPainter getNotificationPainter(com.bitdubai.fermat_api.layer.osa_android.broadcaster.FermatBundle fermatBundle) {
    int notificationID = fermatBundle.getInt(NotificationBundleConstants.NOTIFICATION_ID);
    switch (notificationID) {
        case com.bitdubai.fermat_cbp_api.all_definition.constants.CBPBroadcasterConstants.CBC_CONNECTION_REQUEST_RECEIVED :
            return new com.bitdubai.sub_app.crypto_broker_community.common.notifications.CommunityNotificationPainter("Crypto Broker Community", "A Broker wants to connect with you.", "", R.drawable.cbc_ic_nav_connections);
        case com.bitdubai.fermat_cbp_api.all_definition.constants.CBPBroadcasterConstants.CBC_ACTOR_CONNECTED :
            return new com.bitdubai.sub_app.crypto_broker_community.common.notifications.CommunityNotificationPainter("Crypto Broker Community", "A Broker accepted your connection request.", "", R.drawable.cbc_ic_nav_connections);
        default :
            return null;
    }
}