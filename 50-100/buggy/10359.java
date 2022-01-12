@java.lang.Override
public java.util.List<org.opennms.web.enlinkd.LldpLinkNode> getLldpLinks(int nodeId) {
    java.util.List<org.opennms.web.enlinkd.LldpLinkNode> nodelinks = new java.util.ArrayList<org.opennms.web.enlinkd.LldpLinkNode>();
    for (org.opennms.netmgt.model.LldpLink link : m_lldpLinkDao.findByNodeId(java.lang.Integer.valueOf(nodeId))) {
        nodelinks.addAll(convertFromModel(nodeId, link));
    }
    return nodelinks;
}