public java.lang.String[][] toArray(org.deidentifier.arx.DataHandle handle) {
    java.util.List<java.lang.String[]> list = new java.util.ArrayList<java.lang.String[]>();
    java.util.Iterator<java.lang.String[]> iter = handle.iterator();
    iter.next();
    for (; iter.hasNext();) {
        list.add(iter.next());
    }
    return list.toArray(new java.lang.String[list.size()][]);
}