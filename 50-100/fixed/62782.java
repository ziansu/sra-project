@java.lang.Override
public void removeAt(int position) {
    charger();
    ElementSuite courant = getAt(position);
    if (courant == null) {
        java.lang.System.out.println("Erreur removeAt: element hors de portee");
        return ;
    }
    ElementSuite avant = getAt((position - 1));
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