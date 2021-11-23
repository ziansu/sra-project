public microbat.model.value.VarValue findVarValue(java.lang.String varID) {
    java.util.Set<java.lang.String> visitedIDs = new java.util.HashSet<>();
    microbat.model.value.VarValue value = findVarValue(varID, visitedIDs);
    return value;
}