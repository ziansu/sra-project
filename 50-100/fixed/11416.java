public java.lang.String getNodeName(final com.hazelcast.core.Member iMember) {
    if (iMember == null)
        return "?";
    
    if (nodeUuid.equals(iMember.getUuid()))
        return nodeName;
    
    final java.lang.String name = activeNodesNamesByMemberId.get(iMember.getUuid());
    if (name != null)
        return name;
    
    final com.orientechnologies.orient.core.record.impl.ODocument cfg = getNodeConfigurationByUuid(iMember.getUuid(), true);
    if (cfg != null)
        return cfg.field("name");
    
    return "ext:" + (iMember.getUuid());
}