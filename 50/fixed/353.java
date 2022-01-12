@java.lang.Override
public final java.util.List<java.lang.String> tokenizeToList(final java.lang.String input) {
    if (input.isEmpty()) {
        return new java.util.ArrayList<>();
    }
    return java.util.Arrays.asList(org.simmetrics.tokenizers.WhitespaceTokenizer.pattern.split(input));
}