private java.lang.String swapDayAndMonth(java.lang.String input) {
    java.util.regex.Pattern dayMonthYearPattern = java.util.regex.Pattern.compile(seedu.ezdo.logic.parser.DateParser.DAY_MONTH_YEAR_FORMAT);
    java.util.regex.Matcher matcher = dayMonthYearPattern.matcher(input);
    matcher.matches();
    return ((matcher.group(2)) + (matcher.group(1))) + (matcher.group(3));
}