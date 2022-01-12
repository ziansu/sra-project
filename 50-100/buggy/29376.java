de.ovgu.softwareprojekt.networking.ClientConnection getUnboundHandler() throws java.io.IOException {
    de.ovgu.softwareprojekt.networking.ClientConnection newHandler = new de.ovgu.softwareprojekt.networking.ClientConnection(mServerName, mExceptionListener, mCommandListener, mClientListener, mDataSink);
    for (java.util.Map.Entry<de.ovgu.softwareprojekt.SensorType, java.lang.Float> sensor : mSensorOutputRanges.entrySet())
        newHandler.setOutputRange(sensor.getKey(), sensor.getValue());
    
    return newHandler;
}