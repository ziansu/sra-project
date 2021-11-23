private void linkAlias(final org.jboss.errai.ioc.rebind.ioc.graph.DependencyGraphBuilderImpl.Alias alias) {
    final java.util.Collection<org.jboss.errai.ioc.rebind.ioc.graph.DependencyGraphBuilderImpl.Alias> candidates = directAliasesByAssignableTypes.get(alias.type);
    for (final org.jboss.errai.ioc.rebind.ioc.graph.DependencyGraphBuilderImpl.Alias candidate : candidates) {
        if (alias.qualifier.isSatisfiedBy(candidate.qualifier)) {
            alias.linked.add(candidate);
        }
    }
}