@java.lang.Override
public boolean isConnected() {
    if (((mqttService) != null) && ((clientHandle) != null))
        return mqttService.isConnected(clientHandle);
    else
        return false;
    
}