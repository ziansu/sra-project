@java.lang.Override
public java.util.Collection<org.openhab.binding.zwave.internal.protocol.SerialMessage> getDynamicValues(boolean refresh) {
    java.util.ArrayList<org.openhab.binding.zwave.internal.protocol.SerialMessage> result = new java.util.ArrayList<org.openhab.binding.zwave.internal.protocol.SerialMessage>();
    if (refresh == true) {
        initialiseName = false;
        initialiseLocation = false;
    }
    if ((initialiseName) == false) {
        result.add(this.getNameMessage());
    }
    if ((initialiseLocation) == false) {
        result.add(this.getLocationMessage());
    }
    return result;
}