public static float venteProduit(long id, int quantiteDemandee) {
    org.hibernate.Session session = fr.miage.agents.fournisseur.util.HibernateUtil.openSession();
    fr.miage.agents.fournisseur.model.Produit p = ((fr.miage.agents.fournisseur.model.Produit) (session.get(fr.miage.agents.fournisseur.model.Produit.class, id)));
    float prixCalculeProduitStocke = fr.miage.agents.fournisseur.strategie.Strategie.getPrixStrategiqueByQuantiteStockee(p);
    float prixCalculePourDemande = fr.miage.agents.fournisseur.strategie.Strategie.getPrixStrategiqueByQuantiteDemandee(p, quantiteDemandee);
    float prixVente = (prixCalculeProduitStocke + prixCalculePourDemande) / 2;
    return prixVente * quantiteDemandee;
}