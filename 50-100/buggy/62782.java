@java.lang.Override
public void removeAt(int position) {
    charger();
    ElementSuite avant = getAt((position - 1));
    ElementSuite courant = getAt(position);
    if (courant == null) {
        java.lang.System.out.println("Erreur removeAt: element hors de portee");
        return ;
    }
    if (avant != null) {
        avant.prochain = courant.next();
    }
    if (position == 0) {
        premierElement = courant.next();
    }
    courant.prochain = null;
    indexInterne = position;
    sauvegarder();
}