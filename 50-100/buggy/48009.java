public static boolean isTimePresent(java.lang.String date) {
    java.util.List<com.joestelmach.natty.DateGroup> parsedDatesList = seedu.taskmanager.logic.parser.DateTimeUtil.dateTimeParser.parse(date);
    assert seedu.taskmanager.logic.parser.DateTimeUtil.isValidArg(parsedDatesList);
    com.joestelmach.natty.DateGroup parsedDate = parsedDatesList.get(seedu.taskmanager.logic.parser.DateTimeUtil.FIRST_ELEMENT_INDEX);
    java.lang.String syntaxTreeString = parsedDate.getSyntaxTree().getChild(seedu.taskmanager.logic.parser.DateTimeUtil.FIRST_ELEMENT_INDEX).toStringTree();
    return ((syntaxTreeString.contains(seedu.taskmanager.logic.parser.DateTimeUtil.EXPLICIT_TIME_SYNTAX)) || (syntaxTreeString.contains(seedu.taskmanager.logic.parser.DateTimeUtil.RELATIVE_TIME_SYNTAX))) || (syntaxTreeString.contains(seedu.taskmanager.logic.parser.DateTimeUtil.NOW_SYNTAX));
}