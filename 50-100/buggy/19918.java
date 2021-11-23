public static java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> createMixedConfig(java.util.Map<java.lang.String, java.lang.Object> persisted, java.util.Map<java.lang.String, java.lang.Object> spec) {
    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> mixed = new java.util.HashMap<>();
    mixed.put("confPersisted", persisted);
    mixed.put("confSpec", spec);
    return mixed;
}