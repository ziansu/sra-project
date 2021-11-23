private void addScript(org.etan.portal.integration.nexusservice.service.dto.NexusScriptDto nexusScriptDto, org.etan.portal.integration.nexusservice.service.script.NexusScriptAction action) throws org.etan.portal.integration.nexusservice.service.exception.NexusException {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    java.lang.String scriptJson = gson.toJson(nexusScriptDto);
    try {
        dataRequesterService.postJsonToUrlWithAuthorization(org.etan.portal.integration.nexusservice.service.script.NexusRemoteScriptManager.SCRIPT_URL, org.etan.portal.integration.nexusservice.service.script.NexusRemoteScriptManager.USERNAME, org.etan.portal.integration.nexusservice.service.script.NexusRemoteScriptManager.PASSWORD, scriptJson);
    } catch (org.etan.portal.integration.datarequester.service.exception.DataRequestException e) {
        throw new org.etan.portal.integration.nexusservice.service.exception.NexusException(e.getMessage(), e);
    }
}