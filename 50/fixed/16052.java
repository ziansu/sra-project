static int getInt(java.util.Map<java.lang.String, java.lang.Object> jndiVariables, java.lang.String name, int defaultValue) {
    java.lang.Object value = jndiVariables.get(name);
    return value instanceof java.lang.Integer ? ((java.lang.Integer) (value)) : defaultValue;
}