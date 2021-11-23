private java.util.Optional<java.util.List<java.lang.Integer>> parseNonRangedIndexTokens(java.util.List<java.lang.String> tokens) {
    final java.util.List<java.lang.Integer> indices = new java.util.ArrayList<>();
    for (final java.lang.String token : tokens) {
        final java.util.Optional<java.lang.Integer> index = parseIndex(token);
        if (!(index.isPresent())) {
            return java.util.Optional.empty();
        }
        indices.add(index.get());
    }
    return java.util.Optional.of(indices);
}