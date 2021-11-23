private org.spockframework.runtime.model.NameProvider<org.spockframework.runtime.model.IterationInfo> chooseNameProvider(spock.lang.Unroll unroll, org.spockframework.runtime.model.FeatureInfo feature) {
    if ((unroll.value().length()) > 0) {
        return new org.spockframework.runtime.extension.builtin.UnrollNameProvider(feature, unroll.value());
    }
    if (feature.getName().contains("#")) {
        return new org.spockframework.runtime.extension.builtin.UnrollNameProvider(feature, feature.getName());
    }
    return null;
}