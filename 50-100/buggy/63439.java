private java.util.List<org.ocpsoft.rewrite.servlet.spi.DispatcherTypeProvider> getDispatcherTypeProviders() {
    if ((dispatcherTypeProviders) == null) {
        dispatcherTypeProviders = org.ocpsoft.common.util.Iterators.asList(org.ocpsoft.common.services.ServiceLoader.loadTypesafe(org.ocpsoft.rewrite.servlet.spi.DispatcherTypeProvider.class).iterator());
        java.util.Collections.sort(dispatcherTypeProviders, new org.ocpsoft.common.pattern.WeightedComparator());
    }
    return dispatcherTypeProviders;
}