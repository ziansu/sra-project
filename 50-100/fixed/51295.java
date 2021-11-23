private void rechercheProduitParId(java.lang.Long id, java.util.UUID session) {
    java.util.Optional<fr.miage.supermarche.persist.Produit> maybe_p = fr.miage.supermarche.persist.Produit.getById(id);
    java.util.List<fr.miage.supermarche.util.ApiProduit> ps = new java.util.LinkedList<>();
    if (maybe_p.isPresent()) {
        fr.miage.supermarche.util.ApiProduit evilP = maybe_p.get().toApiProduit();
        ps.add(evilP);
    }
    fr.miage.agents.api.message.recherche.ResultatRecherche rr = new fr.miage.agents.api.message.recherche.ResultatRecherche();
    rr.produitList = fr.miage.supermarche.util.ApiProduit.toRawApiProduitList(ps);
    rr.Session = session;
    this.envoyerMessage(rr);
}