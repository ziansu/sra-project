public void setEmailAddress(org.wahlzeit.services.EmailAddress emailAddress) {
    org.wahlzeit.model.Client client = getClient();
    if (client != null) {
        client.setEmailAddress(emailAddress);
        setClient(client);
    }else {
        org.wahlzeit.model.UserSession.log.warning(org.wahlzeit.services.LogBuilder.createSystemMessage().addMessage("attempted to set email address, but client=null!").toString());
    }
}