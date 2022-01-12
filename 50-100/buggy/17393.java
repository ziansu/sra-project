int updateReplicas(java.util.List<java.lang.Long> replicas) {
    java.util.Set<java.lang.Long> newSet = new java.util.HashSet<java.lang.Long>(replicas);
    m_expectedHSIds.retainAll(newSet);
    org.voltdb.iv2.DuplicateCounter.tmLog.info(java.lang.String.format("*** RELEASING TXN %d", m_txnId));
    if ((m_expectedHSIds.size()) == 0) {
        return org.voltdb.iv2.DuplicateCounter.DONE;
    }else {
        return org.voltdb.iv2.DuplicateCounter.WAITING;
    }
}