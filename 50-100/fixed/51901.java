public long[] getInfo(starthack.fridgetogo.UDPServer server) throws java.lang.Exception {
    java.lang.String message = server.getPacket();
    long temperature = getTemperature(message);
    long humidity = getHumidity(message);
    info[0] = temperature;
    info[1] = humidity;
    return info;
}