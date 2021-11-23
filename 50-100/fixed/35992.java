public synchronized boolean isSleepyOrEndDevice() {
    if (((_node) != null) && ((_node.getCapabilityInformation()) != null)) {
        if (_node.getCapabilityInformation().isDeviceIsFFD())
            return false;
        else
            return true;
        
    }else
        return true;
    
}