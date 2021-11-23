private static int numCases(org.renjin.stats.internals.AtomicVector vector) {
    org.renjin.stats.internals.Vector dim = vector.getAttributes().getDim();
    if ((dim.length()) == 2) {
        return dim.getElementAsInt(0);
    }else {
        return vector.length();
    }
}