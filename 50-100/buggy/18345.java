private static int numCases(org.renjin.stats.internals.AtomicVector vector) {
    org.renjin.stats.internals.Vector dim = vector.getAttributes().getDim();
    if ((dim.length()) == 2) {
        return dim.getElementAsInt(1);
    }else {
        return vector.length();
    }
}