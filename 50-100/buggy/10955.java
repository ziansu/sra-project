public boolean canAdvance(java.util.ArrayList<java.lang.Integer> counters, java.util.ArrayList<java.lang.Integer> boundaries) {
    for (int cElem = 0; (cElem < (counters.size())) && (cElem < (boundaries.size())); ++cElem) {
        if (!(counters.get(cElem).equals(boundaries.get(cElem))))
            return true;
        
    }
    return false;
}