public com.scg.document.model.SAPUser getSAPUser(java.lang.String xomLanID) throws java.lang.Exception {
    com.scg.document.model.SAPUser sapUser = restTemplate.getForObject(sapUserServiceURL.replace("{xomLanID}", xomLanID), com.scg.document.model.SAPUser.class);
    return sapUser;
}