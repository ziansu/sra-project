private com.google.common.collect.Multimap<com.sun.source.tree.ImportTree, com.google.errorprone.bugpatterns.WildcardImport.TypeToImport> groupImports(com.google.common.collect.ImmutableList<com.sun.source.tree.ImportTree> wildcardImports, java.util.Set<com.google.errorprone.bugpatterns.WildcardImport.TypeToImport> typesToImport) {
    com.google.common.collect.Multimap<com.sun.source.tree.ImportTree, com.google.errorprone.bugpatterns.WildcardImport.TypeToImport> toFix = com.google.common.collect.LinkedListMultimap.create();
    for (com.google.errorprone.bugpatterns.WildcardImport.TypeToImport type : typesToImport) {
        com.sun.source.tree.ImportTree wildcard = findMatchingWildcardImport(wildcardImports, type);
        if (wildcard != null) {
            toFix.put(wildcard, type);
        }
    }
    return toFix;
}