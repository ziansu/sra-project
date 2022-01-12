public synchronized void acceptMastership(int partitionId) {
    com.google_voltpatches.common.base.Preconditions.checkArgument(m_masterOfPartitions.add(partitionId), ("can't acquire mastership twice for partition id: " + partitionId));
    org.voltdb.export.ExportManager.exportLog.info(("ExportManager accepting mastership for partition " + partitionId));
    if ((m_generation) == null) {
        return ;
    }
    m_generation.acceptMastershipTask(partitionId);
}