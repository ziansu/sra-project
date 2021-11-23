private static void addPackageDependency(java.util.Set<org.jboss.apiviz.Edge> edgesToRender, org.jboss.apiviz.PackageDoc source, org.jboss.apiviz.PackageDoc target) {
    if (((((source != null) && (target != null)) && (source != target)) && (source.isIncluded())) && (target.isIncluded())) {
        edgesToRender.add(new org.jboss.apiviz.Edge(org.jboss.apiviz.EdgeType.EdgeType.DEPENDENCY, source, target));
    }
}