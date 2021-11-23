public static java.util.List<java.util.Date> parse(java.lang.String date) throws seedu.tasklist.commons.exceptions.IllegalValueException {
    java.util.List<java.util.Date> dates = new org.ocpsoft.prettytime.nlp.PrettyTimeParser().parse(date);
    if (dates.isEmpty()) {
        throw new seedu.tasklist.commons.exceptions.IllegalValueException(seedu.tasklist.logic.parser.DateParser.NO_DATES_MESSAGE);
    }
    if ((dates.size()) > 2) {
        throw new seedu.tasklist.commons.exceptions.IllegalValueException(seedu.tasklist.logic.parser.DateParser.EXCESS_DATES);
    }
    return dates;
}