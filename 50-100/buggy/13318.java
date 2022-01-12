private org.spockframework.runtime.model.NameProvider<org.spockframework.runtime.model.IterationInfo> chooseNameProvider(spock.lang.Unroll unroll, org.spockframework.runtime.model.FeatureInfo feature) {
    if ((unroll.value()) != (groovy.lang.Closure.class)) {
        return new org.spockframework.runtime.extension.builtin.ClosureBasedUnrollNameProvider(feature, unroll.value());
    }
    if (feature.getName().contains("#")) {
        return new org.spockframework.runtime.extension.builtin.UnrollNameProvider(feature, feature.getName());
    }
    return null;
}