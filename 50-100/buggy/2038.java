private void processNewTransmitterData(com.eveningoutpost.dexdrip.Models.TransmitterData transmitterData, long timestamp) {
    if (transmitterData == null) {
        return ;
    }
    com.eveningoutpost.dexdrip.Sensor sensor = com.eveningoutpost.dexdrip.Sensor.currentSensor();
    if (sensor == null) {
        android.util.Log.w(com.eveningoutpost.dexdrip.Services.DexCollectionService.TAG, "setSerialDataToTransmitterRawData: No Active Sensor, Data only stored in Transmitter Data");
        return ;
    }
    sensor.latest_battery_level = java.lang.Math.min(sensor.latest_battery_level, transmitterData.sensor_battery_level);
    sensor.save();
    com.eveningoutpost.dexdrip.Models.BgReading.create(transmitterData.raw_data, transmitterData.filtered_data, this, timestamp);
}