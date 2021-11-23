@java.lang.Override
public void stop() throws org.sensorhub.api.common.SensorHubException {
    if ((dataInterface) != null)
        dataInterface.stop();
    
    if ((commProvider) != null) {
        commProvider.stop();
        commProvider = null;
    }
}