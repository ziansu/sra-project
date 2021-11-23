@org.junit.Test
public void acceptOnlyConcreteEmbeddedOrRuntimeImpliedDependenciesAfterTraversingExtension() throws java.lang.Exception {
    final org.commonjava.maven.atlas.graph.rel.ExtensionRelationship plugin = new org.commonjava.maven.atlas.graph.rel.ExtensionRelationship(from, root, src, 0);
    final org.commonjava.maven.atlas.graph.filter.ProjectRelationshipFilter child = filter.getChildFilter(plugin);
    org.commonjava.maven.cartographer.testutil.PresetAssertions.assertConcreteAcceptance(child, from, src, tgt, new java.util.HashSet<org.commonjava.maven.atlas.ident.DependencyScope>(java.util.Arrays.asList(org.commonjava.maven.atlas.ident.DependencyScope.embedded, org.commonjava.maven.atlas.ident.DependencyScope.runtime, org.commonjava.maven.atlas.ident.DependencyScope.compile)), org.commonjava.maven.atlas.graph.rel.RelationshipType.DEPENDENCY, org.commonjava.maven.atlas.graph.rel.RelationshipType.PARENT, org.commonjava.maven.atlas.graph.rel.RelationshipType.BOM);
    org.commonjava.maven.cartographer.testutil.PresetAssertions.assertRejectsAllManaged(child, from, src, tgt);
}