private int tryParseIndex(java.lang.String argIndex) throws java.lang.IllegalArgumentException, java.lang.NullPointerException {
    java.util.Optional<java.lang.Integer> index = parseIndex(argIndex);
    if (!(index.isPresent())) {
        java.lang.System.out.println("invalid index");
        throw new java.lang.IllegalArgumentException();
    }
    return index.get();
}