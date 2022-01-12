public java.lang.String get(java.lang.String paramName) {
    if (!(argumentsMap.containsKey(("--" + paramName)))) {
        throw new java.lang.RuntimeException((paramName + " is required"));
    }
    return argumentsMap.get(("--" + paramName));
}