private boolean substituteVariables(java.util.Set<java.lang.String> usedVariables) {
    java.util.Set<java.lang.String> dependencies = new java.util.LinkedHashSet<>();
    for (java.lang.String variableName : usedVariables) {
        addDeclarations(variableName, dependencies);
    }
    boolean substituted = dependencies != usedVariables;
    usedVariables.clear();
    usedVariables.addAll(dependencies);
    return substituted;
}