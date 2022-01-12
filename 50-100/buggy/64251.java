private java.util.Optional<java.lang.Integer> parseIndex(java.lang.String command) {
    final java.util.regex.Matcher matcher = seedu.address.logic.parser.Parser.PERSON_INDEX_ARGS_FORMAT.matcher(command.trim());
    if (!(matcher.matches())) {
        return java.util.Optional.empty();
    }
    java.lang.String index = matcher.group("targetIndex");
    if (!(seedu.address.commons.util.StringUtil.isUnsignedInteger(index))) {
        return java.util.Optional.empty();
    }
    return java.util.Optional.of(java.lang.Integer.parseInt(index));
}