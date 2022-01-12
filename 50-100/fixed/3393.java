private static java.lang.String getTokenizationString() {
    java.util.StringJoiner joiner = new java.util.StringJoiner(")|(");
    joiner.add(utilities.structuredmap.JsonScanner.DOUBLE_REGEX);
    joiner.add(utilities.structuredmap.JsonScanner.STRING_REGEX);
    for (java.lang.String simpleRegex : utilities.structuredmap.JsonScanner.SIMPLE_TOKEN_REGEXES) {
        joiner.add(simpleRegex);
    }
    return ("(" + (joiner.toString())) + ")";
}