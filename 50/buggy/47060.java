public microbat.model.value.VarValue findVarValue(java.lang.String varID) {
    java.util.ArrayList<java.lang.String> visitedIDs = new java.util.ArrayList<>();
    microbat.model.value.VarValue value = findVarValue(varID, visitedIDs);
    return value;
}