private java.util.Collection convertToTimeLogEntryObjects(nu.xom.Elements entries) {
    if (entries == null) {
        return new java.util.Vector(0);
    }
    java.util.Vector v = new java.util.Vector();
    for (int i = 0; i < (entries.size()); i++) {
        net.sf.memoranda.TimeLogEntry t = new net.sf.memoranda.TimeLogEntry(entries.get(i), this);
        v.add(t);
    }
    return v;
}