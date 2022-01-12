private void setBlockTotal() throws java.io.IOException {
    org.apache.hadoop.hdfs.server.namenode.FSNamesystem.SafeModeInfo safeMode = this.safeMode;
    if (safeMode == null) {
        return ;
    }
    safeMode.setBlockTotal(blockManager.getTotalCompleteBlocks());
}