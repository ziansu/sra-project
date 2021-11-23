private static java.lang.String getKindForAliasClass(java.lang.String simpleName) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : org.ballerinalang.composer.service.workspace.tools.ModelGenerator.alias.entrySet()) {
        if (simpleName.equals(entry.getValue())) {
            return entry.getKey();
        }
    }
    throw new java.lang.AssertionError(("Undefined entry :" + simpleName));
}