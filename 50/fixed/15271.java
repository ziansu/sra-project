private void gererRecherche(fr.miage.agents.api.message.recherche.Rechercher r) {
    java.lang.Long id = r.idProduit;
    if (id > 0) {
        rechercheProduitParId(r.idProduit, r.session);
    }else {
        rechercheProduitParCriteres(r);
    }
}