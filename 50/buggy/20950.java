@java.lang.Override
public void updateCapabilities() throws org.sensorhub.api.service.ServiceException {
    if (!(sensor.isEnabled()))
        super.updateCapabilities();
    
}