@java.lang.Override
public boolean isCallbackOrderingPostreq(org.openflow.protocol.OFType type, java.lang.String name) {
    return (!(name.equals(getName()))) && ((net.floodlightcontroller.happensbefore.HappensBefore.IN_TYPES.contains(type)) || (name.contains("HappensBeforePost")));
}