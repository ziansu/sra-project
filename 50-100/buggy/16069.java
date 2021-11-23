public java.lang.Boolean recordIncomingMac(net.floodlightcontroller.packet.MACAddress inAddress, edu.wisc.cs.sdn.vnet.Iface port) {
    java.lang.Boolean retVal = false;
    edu.wisc.cs.sdn.vnet.TimedIface timedPort = new edu.wisc.cs.sdn.vnet.TimedIface(port, this);
    if (deviceInterface.containsValue(inAddress)) {
        retVal = true;
        deviceInterface.get(inAddress).resetTtlTimer();
    }else {
        deviceInterface.put(inAddress, timedPort);
    }
    return retVal;
}