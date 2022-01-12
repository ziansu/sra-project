public java.lang.String get(java.lang.String arg) {
    if (!(argumentsMap.containsKey(("--" + arg)))) {
        throw new java.lang.RuntimeException((arg + " is required"));
    }
    return argumentsMap.get(("--" + arg));
}