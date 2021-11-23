private com.google.common.collect.Multimap<com.sun.source.tree.ImportTree, com.google.errorprone.bugpatterns.WildcardImport.TypeToImport> groupImports(com.google.common.collect.ImmutableList<com.sun.source.tree.ImportTree> wildcardImports, java.util.Set<com.google.errorprone.bugpatterns.WildcardImport.TypeToImport> typesToImport) {
    com.google.common.collect.Multimap<com.sun.source.tree.ImportTree, com.google.errorprone.bugpatterns.WildcardImport.TypeToImport> toFix = com.google.common.collect.LinkedListMultimap.create();
    for (com.google.errorprone.bugpatterns.WildcardImport.TypeToImport type : typesToImport) {
        toFix.put(findMatchingWildcardImport(wildcardImports, type), type);
    }
    return toFix;
}