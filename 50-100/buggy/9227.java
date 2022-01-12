public static com.eveningoutpost.dexdrip.Models.TransmitterData create(int raw_data, int sensor_battery_level, long timestamp) {
    com.eveningoutpost.dexdrip.Models.TransmitterData.randomDelay(50, 200);
    if (!(com.eveningoutpost.dexdrip.Models.TransmitterData.is_new(timestamp, raw_data))) {
        return null;
    }
    com.eveningoutpost.dexdrip.Models.TransmitterData transmitterData = new com.eveningoutpost.dexdrip.Models.TransmitterData();
    transmitterData.sensor_battery_level = sensor_battery_level;
    transmitterData.raw_data = raw_data;
    transmitterData.timestamp = timestamp;
    transmitterData.uuid = java.util.UUID.randomUUID().toString();
    transmitterData.save();
    return transmitterData;
}