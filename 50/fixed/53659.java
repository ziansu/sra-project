private void validateMatcherForNoKeyword(java.lang.String args, java.lang.String regex) throws seedu.address.commons.exceptions.IllegalValueException {
    regex += (seedu.address.logic.parser.CommandParserHelper.REGEX_CLOSE_BRACE) + (seedu.address.logic.parser.CommandParserHelper.REGEX_RECURRENCE_PRIORITY_CLOSE_BRACE);
    generateMatcher(regex, args);
}