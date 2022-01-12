public java.lang.Boolean isValidVera() {
    if ((this.getVeraAddress()) == null)
        return false;
    
    java.util.List<com.bwssystems.HABridge.NamedIP> devicesList = this.getVeraAddress().getDevices();
    if (devicesList.get(0).getIp().contains(Configuration.DEFAULT_ADDRESS))
        return false;
    
    return true;
}