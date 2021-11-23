@java.lang.Override
public boolean move(java.lang.String srcAbsPath, java.lang.String destAbsPath) throws org.apache.sling.api.resource.PersistenceException {
    java.util.List<org.apache.sling.resourceresolver.impl.providers.stateful.StatefulResourceProvider> srcProviders = getMatchingModifiableProviders(srcAbsPath);
    java.util.List<org.apache.sling.resourceresolver.impl.providers.stateful.StatefulResourceProvider> dstProviders = getMatchingModifiableProviders(srcAbsPath);
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.List<org.apache.sling.resourceresolver.impl.providers.stateful.StatefulResourceProvider> intersection = org.apache.commons.collections.ListUtils.intersection(srcProviders, dstProviders);
    for (org.apache.sling.resourceresolver.impl.providers.stateful.StatefulResourceProvider p : intersection) {
        if (p.move(srcAbsPath, destAbsPath)) {
            return true;
        }
    }
    return false;
}