public kg.nais.models.Client getClient() {
    if (((clientId) != 0) && ((clientId) != (client.getClientId()))) {
        client = new kg.nais.facade.ClientFacade().findById(clientId);
        chickList = new kg.nais.facade.ChickFacade().findByClient(new kg.nais.facade.ClientFacade().findById(client.getClientId()));
    }
    return client;
}