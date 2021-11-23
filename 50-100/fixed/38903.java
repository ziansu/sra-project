public chevalierx.kiwapp.models.DossierClient getDossierClient(android.content.Context context) {
    for (chevalierx.kiwapp.models.DossierClient dossierClient : new chevalierx.kiwapp.models.DAO.DossierClientDAO(context).getAllDossierClients()) {
        if ((dossierClient.getId()) == (this.dossierClient)) {
            return dossierClient;
        }
    }
    return null;
}