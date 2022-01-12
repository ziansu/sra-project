@org.junit.Test
public void acceptNothingAfterProvidedDependency() throws java.lang.Exception {
    final org.commonjava.maven.atlas.graph.rel.DependencyRelationship dep = new org.commonjava.maven.atlas.graph.rel.DependencyRelationship(from, root, new org.commonjava.maven.atlas.ident.ref.ArtifactRef(src, "jar", null, false), org.commonjava.maven.atlas.ident.DependencyScope.provided, 0, false);
    final org.commonjava.maven.atlas.graph.filter.ProjectRelationshipFilter child = filter.getChildFilter(dep);
    org.commonjava.maven.cartographer.testutil.PresetAssertions.assertConcreteAcceptance(child, from, src, tgt, new java.util.HashSet<org.commonjava.maven.atlas.ident.DependencyScope>(), org.commonjava.maven.atlas.graph.rel.RelationshipType.BOM, org.commonjava.maven.atlas.graph.rel.RelationshipType.PARENT);
    org.commonjava.maven.cartographer.testutil.PresetAssertions.assertRejectsAllManaged(child, from, src, tgt);
}