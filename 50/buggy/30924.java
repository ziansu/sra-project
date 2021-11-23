@java.lang.Override
protected com.emc.storageos.services.restutil.RestClientItf createNewRestClient(java.net.URI endpoint, java.lang.String username, java.lang.String password, com.sun.jersey.api.client.Client client) {
    return new com.emc.storageos.scaleio.api.restapi.ScaleIORestClient(this, endpoint, username, password, client);
}