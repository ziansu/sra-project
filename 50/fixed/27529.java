private boolean sameType(java.lang.Object flowSet) {
    if (flowSet instanceof soot.toolkits.scalar.ArrayPackedSet)
        return (((soot.toolkits.scalar.ArrayPackedSet<?>) (flowSet)).map) == (map);
    
    return false;
}