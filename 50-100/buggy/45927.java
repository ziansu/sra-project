public void add(java.lang.Object key, qp.utils.Tuple value) {
    java.util.Vector<qp.utils.Tuple> currentRecords = index.get(key);
    if (currentRecords == null) {
        currentRecords = new java.util.Vector<qp.utils.Tuple>();
        index.put(key, currentRecords);
    }
    currentRecords.add(value);
}