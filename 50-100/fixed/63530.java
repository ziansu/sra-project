public static float getPrixStrategiqueByQuantiteStockee(fr.miage.agents.fournisseur.model.Produit p) {
    return ((float) ((p.getPrixProduit()) * ((0.5 * (java.lang.Math.exp(((-0.0025) * (p.getQuantiteProduit()))))) + 0.25))) * (p.getPrixProduit());
}