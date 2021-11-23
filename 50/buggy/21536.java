@java.lang.Override
public com.cloud.cluster.ManagementServerHostVO getPeer(java.lang.String mgmtServerId) {
    return _mshostDao.findByMsid(java.lang.Long.valueOf(mgmtServerId));
}