@java.lang.Override
protected void buildDemoApplicationImpl(org.kaaproject.kaa.server.common.admin.AdminClient client) throws java.lang.Exception {
    org.kaaproject.kaa.common.dto.admin.SdkProfileDto sdkProfile = createNotificationApplication(client, "Notification demo", "notification_schema.avsc", "mandatory_notification.json", "optional_notification.json");
    projectsSdkMap.put(org.kaaproject.kaa.examples.notification.NotificationDemoBuilder.NOTIFICATION_DEMO_JAVA_ID, sdkProfile);
    projectsSdkMap.put(org.kaaproject.kaa.examples.notification.NotificationDemoBuilder.NOTIFICATION_DEMO_CPP_ID, sdkProfile);
    projectsSdkMap.put(org.kaaproject.kaa.examples.notification.NotificationDemoBuilder.NOTIFICATION_DEMO_C_ID, sdkProfile);
    projectsSdkMap.put(org.kaaproject.kaa.examples.notification.NotificationDemoBuilder.NOTIFICATION_DEMO_OBJC_ID, sdkProfile);
    projectsSdkMap.put(org.kaaproject.kaa.examples.notification.NotificationDemoBuilder.NOTIFICATION_DEMO_ANDROID_ID, sdkProfile);
}