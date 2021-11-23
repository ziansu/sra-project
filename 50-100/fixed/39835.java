public java.util.Optional<java.lang.String> extractText(java.lang.String... keywords) {
    int endIndex = getFirstOccurrenceOf(0, keywords);
    endIndex = (endIndex == (-1)) ? input.length() : endIndex;
    java.lang.String text = input.substring(0, endIndex).trim();
    if (text.isEmpty()) {
        return java.util.Optional.empty();
    }else {
        input = input.substring(endIndex);
        return java.util.Optional.of(text);
    }
}