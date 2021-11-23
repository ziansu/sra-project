private org.kuali.kra.protocol.actions.ProtocolActionBase getLastApprovalAction() {
    org.kuali.kra.protocol.actions.ProtocolActionBase result = null;
    for (org.kuali.kra.protocol.actions.ProtocolActionBase action : getProtocol().getProtocolActions()) {
        if (((ProtocolActionType.APPROVED.equals(action.getProtocolActionTypeCode())) || (ProtocolActionType.EXPEDITE_APPROVAL.equals(action.getProtocolActionTypeCode()))) || (ProtocolActionType.GRANT_EXEMPTION.equals(action.getProtocolActionTypeCode()))) {
            result = action;
        }
    }
    return result;
}