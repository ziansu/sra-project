private int tryParseIndex(java.lang.String argIndex) throws java.lang.IllegalArgumentException, java.lang.NullPointerException {
    java.util.Optional<java.lang.Integer> index = parseIndex(argIndex);
    if (!(index.isPresent())) {
        throw new java.lang.IllegalArgumentException();
    }
    return index.get();
}