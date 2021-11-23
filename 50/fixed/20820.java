@java.lang.Override
public boolean isCallbackOrderingPostreq(org.openflow.protocol.OFType type, java.lang.String name) {
    if (!(name.equals(getName()))) {
        if (net.floodlightcontroller.happensbefore.HappensBefore.IN_TYPES.contains(type)) {
            return true;
        }
    }
    return false;
}