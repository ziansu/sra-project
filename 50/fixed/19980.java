public boolean hasAll(java.util.Set<java.lang.String> requiredFields) {
    return payload.values().keySet().containsAll(requiredFields);
}