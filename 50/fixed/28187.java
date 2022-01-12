protected com.cloud.storage.SnapshotPolicyVO createSnapshotPolicy(java.lang.Long volId) {
    com.cloud.storage.SnapshotPolicyVO policyVO = new com.cloud.storage.SnapshotPolicyVO(volId, "jfkd", "fdfd", DateUtil.IntervalType.DAILY, 8, true);
    policyVO = snapshotPolicyDao.persist(policyVO);
    return policyVO;
}