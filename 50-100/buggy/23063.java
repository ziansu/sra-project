public void addNewDependencies(java.util.List<java.lang.Class<?>> rawTypes) {
    org.evosuite.runtime.util.Inputs.checkNull(rawTypes);
    java.util.Set<java.lang.String> blackList = new java.util.LinkedHashSet<>();
    initBlackListWithEvoSuitePrimitives(blackList);
    rawTypes.stream().forEach(( c) -> dependencies.add(new org.evosuite.setup.DependencyPair(0, new org.evosuite.utils.generic.GenericClass(c).getRawClass())));
    resolveDependencies(blackList);
}