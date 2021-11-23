private static java.util.List<uk.gov.ons.ctp.response.action.export.domain.ActionRequestInstruction> buildMeListOfActionRequests() {
    java.util.List<uk.gov.ons.ctp.response.action.export.domain.ActionRequestInstruction> result = new java.util.ArrayList<>();
    for (int i = 1; i < (uk.gov.ons.ctp.response.action.export.endpoint.ManualTestEndpoint.ACTION_REQUEST_NUMBER); i++) {
        result.add(uk.gov.ons.ctp.response.action.export.endpoint.ManualTestEndpoint.buildAMeActionRequest(i));
    }
    return result;
}