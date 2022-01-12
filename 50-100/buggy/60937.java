private void reportEvent(se.hal.plugin.tellstick.TellstickDevice tellstickDevice, se.hal.plugin.tellstick.HalDeviceData deviceData) {
    if ((sensorListener) != null) {
        if (tellstickDevice instanceof se.hal.plugin.tellstick.HalSensorConfig)
            sensorListener.reportReceived(((se.hal.plugin.tellstick.HalSensorConfig) (tellstickDevice)), deviceData);
        else
            if (tellstickDevice instanceof se.hal.plugin.tellstick.HalEventConfig)
                eventListener.reportReceived(((se.hal.plugin.tellstick.HalEventConfig) (tellstickDevice)), deviceData);
            
        
    }
}