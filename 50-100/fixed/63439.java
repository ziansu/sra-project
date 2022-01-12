private java.util.List<org.ocpsoft.rewrite.servlet.spi.DispatcherTypeProvider> getDispatcherTypeProviders() {
    java.util.List<org.ocpsoft.rewrite.servlet.spi.DispatcherTypeProvider> result = dispatcherTypeProviders;
    if (result == null) {
        synchronized(this) {
            result = dispatcherTypeProviders;
            if (result == null) {
                result = org.ocpsoft.common.util.Iterators.asList(org.ocpsoft.common.services.ServiceLoader.loadTypesafe(org.ocpsoft.rewrite.servlet.spi.DispatcherTypeProvider.class).iterator());
                java.util.Collections.sort(result, new org.ocpsoft.common.pattern.WeightedComparator());
                dispatcherTypeProviders = result;
            }
        }
    }
    return result;
}