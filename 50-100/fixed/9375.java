public void add(int poche, pokemon.modele.Objet obj, int qte) {
    if (inventaire.elementAt(poche).contains(obj)) {
        int indice = inventaire.elementAt(poche).indiceOf(obj);
        inventaire.elementAt(poche).contenu.elementAt(indice).ajoutQte(qte);
    }else {
        inventaire.elementAt(poche).add(new pokemon.modele.UniteStockage<pokemon.modele.Objet>(obj, qte));
    }
}