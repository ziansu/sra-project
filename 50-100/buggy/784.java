@java.lang.Override
public boolean aAssezDeMarge() {
    log.warning((("Replanification partielle nécessaire : " + (minus(indexLast, indexFirst))) + " points d'avance seulement."), Verbose.REPLANIF.masque);
    return (!(uptodate)) && ((minus(indexLast, indexFirst)) < (margeNecessaire));
}