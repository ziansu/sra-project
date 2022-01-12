private void addClassPathToModule(java.lang.String moduleName, org.eclipse.jdt.internal.core.builder.ClasspathLocation cp) {
    java.util.List<org.eclipse.jdt.internal.core.builder.ClasspathLocation> l = this.moduleToClassPathLocations.get(moduleName);
    if (l == null) {
        l = new java.util.ArrayList<>();
        this.moduleToClassPathLocations.put(moduleName, l);
    }
    l.add(cp);
}