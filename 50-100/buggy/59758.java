public static java.lang.String parseColumnAlphabetOfSortInFind(java.lang.String command) {
    assert (command != null) && (!(command.isEmpty()));
    java.util.regex.Matcher matcher = utask.logic.parser.ParserUtil.SORT_IN_FIND_FORMAT.matcher(command);
    java.lang.String column = "";
    if (matcher.matches()) {
        column = matcher.group("columnAlphabet");
    }
    return column;
}