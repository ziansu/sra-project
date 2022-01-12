private java.lang.String getSummeryTableName(java.lang.String sensorName) {
    java.lang.String summeryTableName;
    switch (sensorName) {
        case "battery" :
            return org.wso2.connectedlap.plugin.constants.DeviceTypeConstants.DEVICE_BATTERY_STATS;
        case "charger" :
            return org.wso2.connectedlap.plugin.constants.DeviceTypeConstants.DEVICE_CHARGER_STATS;
        case "cpu" :
            return org.wso2.connectedlap.plugin.constants.DeviceTypeConstants.DEVICE_CPU_STATS;
        case "network" :
            return org.wso2.connectedlap.plugin.constants.DeviceTypeConstants.DEVICE_NETWORK_STATS;
        case "memory" :
            return org.wso2.connectedlap.plugin.constants.DeviceTypeConstants.DEVICE_MEMORY_STATS;
        case "harddisc" :
            return org.wso2.connectedlap.plugin.constants.DeviceTypeConstants.DEVICE_HARD_DISC_STATS;
        default :
            return null;
    }
}