public void sendProperty(int portNum, int value) {
    try {
        super.setProperty(map.findPort(portNum).getPortName(), value);
        super.updateSubscribedProperties(15000);
    } catch (java.lang.Exception e) {
        com.elyxor.xeros.ldcs.thingworx.XerosWasherGlobalThing.logger.warn(com.elyxor.xeros.ldcs.thingworx.XerosWasherGlobalThing.TAG, ("failed to update property " + (map.findPort(portNum))));
    }
}