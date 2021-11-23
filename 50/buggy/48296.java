public com.scg.document.model.SAPUser getSAPUser(java.lang.String xomLanID) throws java.lang.Exception {
    sapUserServiceURL = sapUserServiceURL.replace("{xomLanID}", xomLanID);
    com.scg.document.model.SAPUser sapUser = restTemplate.getForObject(new java.net.URI(sapUserServiceURL), com.scg.document.model.SAPUser.class);
    return sapUser;
}