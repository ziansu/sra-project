private org.wso2.carbon.device.mgt.core.dto.DeviceType clearMetaEntryInfo(org.wso2.carbon.device.mgt.core.dto.DeviceType deviceType) {
    org.wso2.carbon.device.mgt.common.type.mgt.DeviceTypeMetaDefinition metaDefinition = deviceType.getDeviceTypeMetaDefinition();
    metaDefinition.setInitialOperationConfig(null);
    if ((metaDefinition.getPushNotificationConfig()) != null) {
        metaDefinition.setPushNotificationConfig(new org.wso2.carbon.device.mgt.common.push.notification.PushNotificationConfig(metaDefinition.getPushNotificationConfig().getType(), false, null));
    }
    deviceType.setDeviceTypeMetaDefinition(metaDefinition);
    return deviceType;
}