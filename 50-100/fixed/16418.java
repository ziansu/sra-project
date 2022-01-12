public void dataReceived(com.digi.xbee.api.models.XBeeMessage xbeeMessage) {
    java.lang.String line;
    java.lang.String[] sensorData;
    java.lang.System.out.println(("Dragon: " + (xbeeMessage.getDataString())));
    line = xbeeMessage.getDataString();
    while (line != null) {
        sensorData = line.split(":");
        this.temperature = sensorData[0];
        this.humidity = sensorData[1];
        this.carbonDioxide = sensorData[2];
        this.methane = sensorData[3];
    } 
}