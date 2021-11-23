private boolean substituteVariables(java.util.Set<java.lang.String> usedVariables) {
    java.util.Set<java.lang.String> dependencies = new java.util.LinkedHashSet<>(usedVariables);
    for (java.lang.String variableName : usedVariables) {
        addDeclarations(variableName, dependencies);
    }
    boolean substituted = !(usedVariables.equals(dependencies));
    usedVariables.addAll(dependencies);
    return substituted;
}