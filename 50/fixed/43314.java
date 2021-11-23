private java.util.function.Supplier<java.lang.AssertionError> nullArgument(java.lang.String argumentName) {
    return () -> {
        return new java.lang.AssertionError(java.lang.String.format("Invalid use: null %s argument", argumentName));
    };
}