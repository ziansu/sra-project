public static void validateAMDate(java.lang.String dateTime) throws seedu.manager.commons.exceptions.IllegalValueException {
    seedu.manager.commons.util.Parser parser = new seedu.manager.commons.util.Parser();
    java.util.List<seedu.manager.commons.util.DateGroup> groups = parser.parse(dateTime);
    if ((groups.size()) <= 0) {
        throw new seedu.manager.commons.exceptions.IllegalValueException(java.lang.String.format(seedu.manager.commons.core.Messages.MESSAGE_CANNOT_PARSE_TO_DATE, dateTime));
    }
}