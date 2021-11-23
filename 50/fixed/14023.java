public boolean isDayOfMonthWithinRange(java.lang.Integer dayOfMonth) {
    if (dayOfMonth == null) {
        return false;
    }
    return getDays().contains(dayOfMonth);
}