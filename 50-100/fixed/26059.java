public java.lang.Boolean isValidVera() {
    if (((this.getVeraAddress()) == null) || ((this.getVeraAddress().getDevices().size()) <= 0))
        return false;
    
    java.util.List<com.bwssystems.HABridge.NamedIP> devicesList = this.getVeraAddress().getDevices();
    if (devicesList.get(0).getIp().contains(Configuration.DEFAULT_ADDRESS))
        return false;
    
    return true;
}