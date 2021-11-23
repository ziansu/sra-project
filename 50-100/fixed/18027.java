@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> apply(java.util.Map<java.lang.String, java.lang.String> input) {
    com.google.common.collect.ImmutableMap.Builder<java.lang.String, java.lang.String> metadata = com.google.common.collect.ImmutableMap.builder();
    for (java.lang.String key : input.keySet()) {
        metadata.put(key, input.get(key));
    }
    return metadata.build();
}