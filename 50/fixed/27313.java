private static seedu.address.model.task.RecurringType extractRecurringInfo(java.lang.String recurringInfo) throws java.lang.IllegalArgumentException {
    recurringInfo = recurringInfo.toUpperCase().trim();
    seedu.address.logic.parser.RecurringDateParser recurringParser = seedu.address.logic.parser.RecurringDateParser.getInstance();
    return recurringParser.getRecurringType(recurringInfo);
}