public java.lang.Object[] getFullPathInServerClient(java.lang.String key, boolean alwaysReturnParent) {
    return this.getFullPathInServer(key, alwaysReturnParent, org.apache.hadoop.hdfs.server.namenode.NameNodeDummy.staticRoot, false);
}