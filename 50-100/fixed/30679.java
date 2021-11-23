@org.junit.Test
public void acceptOnlyConcreteEmbeddedOrRuntimeImpliedDependenciesAfterTestDependency() throws java.lang.Exception {
    final org.commonjava.maven.atlas.graph.rel.DependencyRelationship dep = new org.commonjava.maven.atlas.graph.rel.DependencyRelationship(from, root, new org.commonjava.maven.atlas.ident.ref.ArtifactRef(src, "jar", null, false), org.commonjava.maven.atlas.ident.DependencyScope.test, 0, false);
    final org.commonjava.maven.atlas.graph.filter.ProjectRelationshipFilter child = filter.getChildFilter(dep);
    org.commonjava.maven.cartographer.testutil.PresetAssertions.assertConcreteAcceptance(child, from, src, tgt, new java.util.HashSet<org.commonjava.maven.atlas.ident.DependencyScope>(java.util.Arrays.asList(org.commonjava.maven.atlas.ident.DependencyScope.embedded, org.commonjava.maven.atlas.ident.DependencyScope.runtime, org.commonjava.maven.atlas.ident.DependencyScope.compile)), org.commonjava.maven.atlas.graph.rel.RelationshipType.DEPENDENCY, org.commonjava.maven.atlas.graph.rel.RelationshipType.PARENT);
    org.commonjava.maven.cartographer.testutil.PresetAssertions.assertRejectsAllManaged(child, from, src, tgt);
}