private boolean etesVousPlacer() {
    int nombreJoueur = listeJoueur.size();
    int nbCaseA1 = 0;
    for (new_idea.Case bouton : listeComposantPlateau) {
        if ((bouton.getValue()) == '1') {
            nbCaseA1++;
        }
    }
    java.lang.System.out.println((nombreJoueur == (nbCaseA1 + 1)));
    return nombreJoueur == (nbCaseA1 + 1);
}