public java.lang.Boolean recordIncomingMac(net.floodlightcontroller.packet.MACAddress inAddress, edu.wisc.cs.sdn.vnet.Iface port) {
    java.lang.Boolean retVal = false;
    if (deviceInterface.containsValue(inAddress)) {
        retVal = true;
        deviceInterface.get(inAddress).resetTtlTimer();
    }else {
        edu.wisc.cs.sdn.vnet.TimedIface timedPort = new edu.wisc.cs.sdn.vnet.TimedIface(port, inAddress, this);
        deviceInterface.put(inAddress, timedPort);
    }
    return retVal;
}