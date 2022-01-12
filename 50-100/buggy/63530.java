public static float getPrixStrategiqueByQuantiteStockee(fr.miage.agents.fournisseur.model.Produit p) {
    int qteStockee = p.getQuantiteProduit();
    float prix = -1;
    if (qteStockee > 0) {
        prix = ((float) ((p.getPrixProduit()) * ((0.5 * (java.lang.Math.exp(((-0.0025) * qteStockee)))) + 0.25)));
    }
    return prix;
}