private java.lang.String extractArgumentValue(java.lang.String argsString, werkbook.task.logic.parser.ArgumentTokenizer.PrefixPosition currentPrefixPosition, werkbook.task.logic.parser.ArgumentTokenizer.PrefixPosition nextPrefixPosition) {
    werkbook.task.logic.parser.ArgumentTokenizer.Prefix prefix = currentPrefixPosition.getPrefix();
    int valueStartPos = (currentPrefixPosition.getStartPosition()) + (prefix.getPrefix().length());
    java.lang.String value = argsString.substring(valueStartPos, nextPrefixPosition.getStartPosition());
    if (prefix.isDateTime()) {
        value = werkbook.task.logic.parser.DateTimeParser.parse(value);
    }
    return value.trim();
}