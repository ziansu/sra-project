private void tourSuivant() {
    if ((numeroJoueur) != ((listeJoueur.size()) - 1)) {
        (numeroJoueur)++;
    }else {
        numeroJoueur = 0;
    }
    if (!(listeJoueur.get(numeroJoueur).isEstHumain())) {
        ordiJoue();
    }
    java.lang.String playerName = listeJoueur.get(numeroJoueur).getPseudo();
    this.setTitle((("tour de " + playerName) + "."));
}