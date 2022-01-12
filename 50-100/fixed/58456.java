private void updatePartitionLocks(org.voltdb.iv2.TransactionTask task, int count) {
    assert (count == 1) || (count == (-1));
    java.util.List<java.lang.Long> hsids = task.getPartitionMasterHsids();
    if (hsids != null) {
        for (java.lang.Long hsid : hsids) {
            org.voltdb.iv2.MpTransactionTaskQueue.PartitionLock pLock = m_lockedPartitions.get(hsid);
            assert pLock != null;
            if (task.getTransactionState().isReadOnly())
                pLock.updateRead(count);
            else
                pLock.updateWrite(count);
            
        }
    }
}