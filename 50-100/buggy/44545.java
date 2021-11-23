public java.util.List<org.opennms.netmgt.model.BridgeMacLink> addBridgeForwardingTableEntry(org.opennms.netmgt.model.OnmsNode node, java.lang.Integer bridgeport, java.lang.String mac, java.util.List<org.opennms.netmgt.model.BridgeMacLink> bft) {
    org.opennms.netmgt.model.BridgeMacLink link = new org.opennms.netmgt.model.BridgeMacLink();
    link.setNode(node);
    link.setBridgePort(bridgeport);
    link.setMacAddress(mac);
    link.setBridgeDot1qTpFdbStatus(BridgeDot1qTpFdbStatus.DOT1D_TP_FDB_STATUS_LEARNED);
    bft.add(link);
    return bft;
}