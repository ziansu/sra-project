private static uk.gov.ons.ctp.response.action.export.domain.ActionRequestInstruction buildActionRequest() {
    uk.gov.ons.ctp.response.action.export.domain.ActionRequestInstruction result = new uk.gov.ons.ctp.response.action.export.domain.ActionRequestInstruction();
    result.setActionId(java.util.UUID.randomUUID());
    result.setActionType("testActionType");
    result.setIac("testIac");
    result.setAddress(uk.gov.ons.ctp.response.action.export.utility.ObjectBuilder.buildActionAddress());
    return result;
}