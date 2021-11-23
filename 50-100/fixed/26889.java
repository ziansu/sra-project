private org.apache.commons.lang3.tuple.Pair<org.onosproject.net.OchPort, org.onosproject.net.OchPort> findPorts(org.onosproject.net.intent.OpticalCircuitIntent intent) {
    org.onosproject.net.OchPort srcPort = findAvailableOchPort(intent.getSrc(), intent);
    if (srcPort == null) {
        return null;
    }
    org.onosproject.net.OchPort dstPort = findAvailableOchPort(intent.getDst(), intent);
    if (dstPort == null) {
        return null;
    }
    return org.apache.commons.lang3.tuple.Pair.of(srcPort, dstPort);
}