private void tourSuivant() {
    if ((numeroJoueur) != ((listeJoueur.size()) - 1)) {
        (numeroJoueur)++;
    }else {
        numeroJoueur = 0;
    }
    if (!(listeJoueur.get(numeroJoueur).isEstHumain())) {
        ordiJoue();
        tourSuivant();
    }
    java.lang.String playerName = listeJoueur.get(numeroJoueur).getPseudo();
    java.lang.System.out.println(numeroJoueur);
    this.setTitle((("tour de " + playerName) + "."));
}