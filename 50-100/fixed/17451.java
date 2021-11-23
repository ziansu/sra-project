public static org.eclipse.emf.compare.Comparison getComparison(org.eclipse.emf.compare.tests.edit.data.ResourceScopeProvider scopeProvider) throws java.io.IOException {
    final org.eclipse.emf.compare.scope.IComparisonScope scope = new org.eclipse.emf.compare.scope.DefaultComparisonScope(scopeProvider.getLeft(), scopeProvider.getRight(), scopeProvider.getOrigin());
    final org.eclipse.emf.compare.EMFCompare.Builder builder = org.eclipse.emf.compare.EMFCompare.builder();
    org.eclipse.emf.compare.rcp.internal.extension.impl.EMFCompareBuilderConfigurator.createDefault().configure(builder);
    return builder.build().compare(scope);
}