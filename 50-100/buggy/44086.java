public static org.opennms.netmgt.xml.event.Event createNodeUpdatedEvent(java.lang.String source, java.lang.Integer nodeId, java.lang.String nodeLabel, java.lang.String labelSource, boolean rescanExisting) {
    org.opennms.netmgt.model.events.EventUtils.debug("CreateNodeUpdatedEvent: nodedId: %d", nodeId);
    org.opennms.netmgt.model.events.EventBuilder bldr = new org.opennms.netmgt.model.events.EventBuilder(org.opennms.netmgt.EventConstants.NODE_UPDATED_EVENT_UEI, source);
    bldr.setNodeid(nodeId);
    bldr.addParam(org.opennms.netmgt.EventConstants.PARM_NODE_LABEL, nodeLabel);
    bldr.addParam(org.opennms.netmgt.EventConstants.PARM_NODE_LABEL_SOURCE, labelSource);
    bldr.addParam(org.opennms.netmgt.EventConstants.PARM_RESCAN_EXISTING, rescanExisting);
    return bldr.getEvent();
}