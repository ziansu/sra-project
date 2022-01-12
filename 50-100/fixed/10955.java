public boolean canAdvance(java.lang.Integer[] counters, java.lang.Integer[] boundaries) {
    for (int cElem = 0; (cElem < (counters.length)) && (cElem < (boundaries.length)); ++cElem) {
        if (!(counters[cElem].equals(boundaries[cElem])))
            return true;
        
    }
    return false;
}