@java.lang.Override
public boolean aAssezDeMarge() {
    boolean out = (uptodate) || ((minus(indexLast, indexFirst)) >= (margeNecessaire));
    if (!out)
        log.warning((("Replanification partielle nécessaire : " + (minus(indexLast, indexFirst))) + " points d'avance seulement."), Verbose.REPLANIF.masque);
    
    return out;
}