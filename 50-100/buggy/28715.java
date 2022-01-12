public java.util.List<com.dexels.navajo.dependency.Dependency> getDependencies(java.lang.String scriptPath, int dependencyType) {
    java.util.List<com.dexels.navajo.dependency.Dependency> allDeps = dependencies.get(scriptPath);
    java.util.List<com.dexels.navajo.dependency.Dependency> result = new java.util.ArrayList<com.dexels.navajo.dependency.Dependency>();
    for (com.dexels.navajo.dependency.Dependency dep : allDeps) {
        if ((dep.getType()) == dependencyType) {
            result.add(dep);
        }
    }
    return result;
}