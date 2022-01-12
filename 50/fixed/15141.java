private java.util.Set<java.lang.String> parseFeatureSet(java.lang.String features) {
    java.lang.String[] split = (features != null) ? features.split(" ") : new java.lang.String[0];
    return new java.util.HashSet<>(java.util.Arrays.asList(split));
}