int numNodes() {
    assert ((org.apache.hadoop.hdfs.server.namenode.BlocksHelper.getTripletsForBlock(this).length) % 3) == 0 : "Malformed BlockInfo";
    for (int idx = (getCapacity()) - 1; idx >= 0; idx--) {
        if ((getDatanode(idx)) != null)
            return idx + 1;
        
    }
    return 0;
}