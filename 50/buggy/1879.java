@java.lang.Override
public boolean removeUserFromPolicy(java.lang.String policyId, java.lang.String userName) {
    boolean removed = ranger.removeUserFromV2Policy(policyId, userName);
    com.asiainfo.bdx.ldp.datafoundry.servicebroker.ocdp.service.impl.KafkaAdminService.LOG.info(("Remove user [{}] from kafka ranger policy [{}] with result: {}" + userName), policyId, removed);
    return removed;
}