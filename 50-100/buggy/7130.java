public org.infobip.mobile.messaging.MobileMessagingCore build() {
    if (!(org.infobip.mobile.messaging.MobileMessagingCore.getApplicationCode(context).equals(applicationCode))) {
        org.infobip.mobile.messaging.MobileMessagingCore.cleanupSettings(context);
    }
    org.infobip.mobile.messaging.MobileMessagingCore mobileMessagingCore = new org.infobip.mobile.messaging.MobileMessagingCore(context);
    mobileMessagingCore.setNotificationSettings(notificationSettings);
    mobileMessagingCore.setApplicationCode(applicationCode);
    org.infobip.mobile.messaging.MobileMessagingCore.instance = mobileMessagingCore;
    mobileMessagingCore.playServicesSupport.checkPlayServices(context);
    return mobileMessagingCore;
}