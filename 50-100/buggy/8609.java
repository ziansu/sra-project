public java.lang.String authenticatePersonalCloud(java.lang.String cspCloudName, java.lang.String cloudName, java.lang.String password) {
    biz.neustar.pc.ui.manager.impl.PersonalCloudManagerImpl.LOGGER.info("In authenticate cloud name {} and csp {}", cspCloudName, cspCloudName);
    com.sun.jersey.api.representation.Form form = new com.sun.jersey.api.representation.Form();
    form.add("password", password);
    biz.neustar.pcloud.ResponseData responseData = pcRestClient.post(java.text.MessageFormat.format(UIRestPathConstants.PERSONAL_CLOUD_AUTH_API, cspCloudName, cspCloudName), form);
    return responseData.getBody();
}