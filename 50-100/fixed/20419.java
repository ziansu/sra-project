com.mikesamuel.cil.ast.meta.TypeNameResolver resolverFor(com.mikesamuel.cil.ast.CompilationUnitNode cu) {
    com.mikesamuel.cil.ast.passes.DeclarationPass.ImportCollector ic = new com.mikesamuel.cil.ast.passes.DeclarationPass.ImportCollector(canonicalizer);
    ic.collectImports(cu);
    com.mikesamuel.cil.ast.meta.TypeNameResolver typeNameResolver = TypeNameResolver.Resolvers.eitherOr(TypeNameResolver.Resolvers.unqualifiedNameToQualifiedTypeResolver(ic.getStaticTypeImports(), logger), TypeNameResolver.Resolvers.wildcardLookup(com.google.common.collect.ImmutableList.of(ic.getCurrentPackage()), canonicalizer), TypeNameResolver.Resolvers.wildcardLookup(ic.getWildcardTypeImports(), canonicalizer), TypeNameResolver.Resolvers.wildcardLookup(com.google.common.collect.ImmutableList.of(com.mikesamuel.cil.ast.passes.DeclarationPass.JAVA_LANG), canonicalizer), canonicalizer);
    return typeNameResolver;
}