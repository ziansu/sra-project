public void execute(java.nio.ByteBuffer rowKey, org.apache.cassandra.db.ColumnFamily cf, org.apache.cassandra.db.composites.Composite prefix, org.apache.cassandra.cql3.UpdateParameters params) throws org.apache.cassandra.exceptions.InvalidRequestException {
    assert column.type.isMultiCell() : "Attempted to delete a single key in a frozen map";
    org.apache.cassandra.cql3.Term.Terminal key = t.bind(params.options);
    if (key == null)
        throw new org.apache.cassandra.exceptions.InvalidRequestException("Invalid null map key");
    
    org.apache.cassandra.db.composites.CellName cellName = cf.getComparator().create(prefix, column, key.get(params.options));
    cf.addColumn(params.makeTombstone(cellName));
}