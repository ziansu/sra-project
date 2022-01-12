public boolean apiKeyValidates(java.lang.String myURL, org.jbei.ice.lib.dto.web.RegistryPartner registryPartner) {
    if (org.apache.commons.lang3.StringUtils.isEmpty(registryPartner.getApiKey()))
        return false;
    
    java.util.HashMap<java.lang.String, java.lang.Object> queryParams = new java.util.HashMap<>();
    queryParams.put("url", myURL);
    org.jbei.ice.lib.dto.web.RegistryPartner response = restClient.getWor(registryPartner.getUrl(), "/accesstokens/web", org.jbei.ice.lib.dto.web.RegistryPartner.class, queryParams, registryPartner.getApiKey());
    if (response == null) {
        org.jbei.ice.lib.common.logging.Logger.error("Could not validate request");
        return false;
    }
    return true;
}