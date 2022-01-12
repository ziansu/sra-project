public static int tryReserve(int baseStationId) {
    int channelId = telecomsimulator.TelecomSimulator.baseStations.get(baseStationId).isFull();
    if (channelId == (-1)) {
        return channelId;
    }
    telecomsimulator.TelecomSimulator.baseStations.get(baseStationId).reserveChannel(channelId);
    return channelId;
}