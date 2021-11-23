public org.biojava.bio.structure.ResidueNumber getResidue(int positionInRange, org.biojava.bio.structure.AtomPositionMap map) {
    if (map == null)
        throw new java.lang.IllegalArgumentException("The AtomPositionMap must be non-null");
    
    int i = 0;
    for (java.util.Map.Entry<org.biojava.bio.structure.ResidueNumber, java.lang.Integer> entry : map.getNavMap().entrySet()) {
        if (i == positionInRange)
            return entry.getKey();
        
        if (contains(entry.getKey(), map)) {
            i++;
        }
    }
    return null;
}