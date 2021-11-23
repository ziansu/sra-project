public static float getPrixStrategiqueByQuantiteDemandee(fr.miage.agents.fournisseur.model.Produit p, int quantiteDemandee) {
    return ((float) ((p.getPrixProduit()) * ((0.5 * (java.lang.Math.exp(((-0.0025) * quantiteDemandee)))) + 0.25)));
}