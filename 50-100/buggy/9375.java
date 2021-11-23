public void add(int poche, pokemon.modele.Objet obj, int qte) {
    int indice = inventaire.elementAt(poche).indiceOf(obj);
    if (indice == (-1)) {
        inventaire.elementAt(poche).add(new pokemon.modele.UniteStockage<pokemon.modele.Objet>(obj, qte));
    }else {
        inventaire.elementAt(poche).contenu.elementAt(indice).ajoutQte(qte);
    }
}