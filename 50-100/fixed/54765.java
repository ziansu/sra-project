@java.lang.SuppressWarnings(value = "unchecked")
private static org.apache.ivy.plugins.resolver.ChainResolver toChainResolver(org.jerkar.api.depmanagement.JkRepos repos) {
    final org.apache.ivy.plugins.resolver.ChainResolver chainResolver = new org.apache.ivy.plugins.resolver.ChainResolver();
    for (final org.jerkar.api.depmanagement.JkRepo jkRepo : repos) {
        final org.apache.ivy.plugins.resolver.DependencyResolver resolver = org.jerkar.api.depmanagement.IvyTranslations.toResolver(jkRepo, java.util.Collections.EMPTY_SET, true);
        resolver.setName(jkRepo.toString());
        chainResolver.add(resolver);
    }
    return chainResolver;
}