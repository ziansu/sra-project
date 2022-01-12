public java.util.Optional<java.lang.String> extractText(java.lang.String... keywords) {
    int endIndex = getFirstOccurrenceOf(0, keywords);
    java.lang.String text = input.substring(0, endIndex).trim();
    input = input.substring(endIndex);
    if (text.isEmpty()) {
        return java.util.Optional.empty();
    }else {
        return java.util.Optional.of(text);
    }
}