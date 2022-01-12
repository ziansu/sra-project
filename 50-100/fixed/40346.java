void processWrittenOFMessage(org.projectfloodlight.openflow.protocol.OFMessage m) {
    switch (m.getType()) {
        case ROLE_REQUEST :
            processOFRoleRequest(((org.projectfloodlight.openflow.protocol.OFRoleRequest) (m)));
            break;
        case EXPERIMENTER :
            if (m instanceof org.projectfloodlight.openflow.protocol.OFNiciraControllerRoleRequest) {
                processOFNiciraControllerRoleRequest(((org.projectfloodlight.openflow.protocol.OFNiciraControllerRoleRequest) (m)));
            }
            break;
        default :
            break;
    }
}