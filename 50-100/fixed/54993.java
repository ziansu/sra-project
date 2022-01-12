public void addToDataset(java.util.ArrayList<java.lang.Double> row) {
    org.apache.cassandra.ml.DataSet set = new org.apache.cassandra.ml.DataSet(row.size());
    boolean success = set.init(row);
    if (success)
        structure.add(new org.apache.cassandra.ml.DenseInstance(1.0, set.row));
    
    checkSize();
    org.apache.cassandra.ml.NonLocalREPTree.logger.debug(("Added successfully, size is " + (this.structure.size())));
}