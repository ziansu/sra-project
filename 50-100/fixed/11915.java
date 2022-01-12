@java.lang.Override
public com.windowsazure.messaging.NotificationPlatform convertTo(com.bosch.cn.dad.notificationhub.model.DeviceType srcDeviceType, com.windowsazure.messaging.NotificationPlatform destPlatform) {
    if (srcDeviceType == null) {
        return null;
    }
    switch (srcDeviceType) {
        case WindowsNotification :
            destPlatform = com.windowsazure.messaging.NotificationPlatform.Wns;
            break;
        case WindowsPhoneNotification :
            destPlatform = com.windowsazure.messaging.NotificationPlatform.Mpns;
            break;
        case AppleNotification :
            destPlatform = com.windowsazure.messaging.NotificationPlatform.Apns;
            break;
        case BaiduNotification :
            destPlatform = com.windowsazure.messaging.NotificationPlatform.Gcm;
            break;
        case GoogleCloudMessaging :
            destPlatform = com.windowsazure.messaging.NotificationPlatform.Gcm;
            break;
        case AmazonDeviceMessaging :
            destPlatform = com.windowsazure.messaging.NotificationPlatform.Adm;
            break;
    }
    return destPlatform;
}