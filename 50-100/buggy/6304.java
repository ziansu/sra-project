private java.lang.String resolvePlaceholders(java.lang.String input) {
    java.lang.String output = input;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : placeholderStore.entrySet()) {
        output = input.replace(java.lang.String.format("${%s}", entry.getKey()), entry.getValue());
    }
    return output;
}