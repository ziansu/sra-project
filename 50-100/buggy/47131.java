private void saveOutOfOrderRow(org.apache.cassandra.db.compaction.DecoratedKey prevKey, org.apache.cassandra.db.compaction.DecoratedKey key, org.apache.cassandra.db.compaction.SSTableIdentityIterator atoms) {
    outputHandler.warn(java.lang.String.format("Out of order row detected (%s found after %s)", key, prevKey));
    org.apache.cassandra.db.compaction.ColumnFamily cf = atoms.getColumnFamily().cloneMeShallow(ArrayBackedSortedColumns.factory, false);
    while (atoms.hasNext()) {
        org.apache.cassandra.db.compaction.OnDiskAtom atom = atoms.next();
        cf.addAtom(atom);
    } 
    outOfOrderRows.add(new org.apache.cassandra.db.compaction.Row(key, cf));
}