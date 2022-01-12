public static java.util.List<uk.gov.ons.ctp.response.action.export.domain.ActionRequestInstruction> buildListOfActionRequests() {
    java.util.List<uk.gov.ons.ctp.response.action.export.domain.ActionRequestInstruction> result = new java.util.ArrayList<>();
    for (int i = 1; i < 51; i++) {
        result.add(uk.gov.ons.ctp.response.action.export.utility.ObjectBuilder.buildActionRequest());
    }
    return result;
}