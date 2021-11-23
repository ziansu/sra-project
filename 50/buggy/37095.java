protected java.lang.String getClassBeingDefined(java.lang.String className) {
    java.lang.String baseName = bsh.Name.suffix(className, 1);
    return ((java.lang.String) (definingClassesBaseNames.get(baseName)));
}