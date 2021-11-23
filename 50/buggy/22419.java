public java.util.List<kg.nais.models.Chick> getChickList() {
    if ((clientId) != 0) {
        chickList = new kg.nais.facade.ChickFacade().findByClient(new kg.nais.facade.ClientFacade().findById(clientId));
    }
    return chickList;
}