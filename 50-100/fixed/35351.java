public void annuler() {
    this.map = annuler_refaire.undo();
    if ((joueurCourant) instanceof engine.HumanPlayer)
        ((engine.HumanPlayer) (joueurCourant)).setCaseJouee(new java.awt.Point(0, 0));
    
    if ((joueurCourant) == (J2))
        joueurCourant = J1;
    else
        joueurCourant = J2;
    
    (numberTurn)--;
    display.afficherJeu();
}