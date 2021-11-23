private void gererRecherche(fr.miage.agents.api.message.recherche.Rechercher r) {
    java.lang.Long id = r.idProduit;
    if (id != null) {
        rechercheProduitParId(r.idProduit, r.session);
    }else {
        rechercheProduitParCriteres(r);
    }
}