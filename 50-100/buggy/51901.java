public long[] getInfo(starthack.fridgetogo.UDPServer server) throws java.lang.Exception {
    java.lang.String message = server.getPacket();
    long temperature = getTemperature(message);
    long humidity = getHumidity(message);
    long[] info = new long[2];
    this.info = info;
    info[0] = temperature;
    info[1] = humidity;
    return info;
}