@java.lang.Override
public com.navercorp.pinpoint.web.vo.AgentInfo getAgentInfo(final java.lang.String agentId, final long timestamp) {
    if (agentId == null) {
        throw new java.lang.NullPointerException("agentId must not be null");
    }
    com.navercorp.pinpoint.web.dao.hbase.Scan scan = createScan(agentId, timestamp);
    return this.hbaseOperations2.find(HBaseTables.AGENTINFO, scan, new com.navercorp.pinpoint.web.dao.hbase.HbaseAgentInfoDao.AgentInfoResultsExtractor());
}