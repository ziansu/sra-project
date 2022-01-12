private java.time.LocalDateTime roundUpTime(java.time.LocalDateTime dateTime) {
    int minutes = dateTime.getMinute();
    if (minutes == (seedu.address.logic.commands.FreetimeCommand.EXACT_AN_HOUR)) {
        return dateTime;
    }
    if (minutes < (seedu.address.logic.commands.FreetimeCommand.HALF_AN_HOUR)) {
        return dateTime.plusMinutes(((seedu.address.logic.commands.FreetimeCommand.HALF_AN_HOUR) - minutes));
    }
    return dateTime.plusMinutes(((seedu.address.logic.commands.FreetimeCommand.AN_HOUR) - minutes));
}