@java.lang.Override
public Moteur.Coup jouer(Moteur.Moteur m) {
    alphabeta(profondeurDiff, java.lang.Integer.MIN_VALUE, java.lang.Integer.MAX_VALUE, new Moteur.Moteur(m));
    return coupOrdiDiff;
}