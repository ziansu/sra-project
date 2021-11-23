public static org.joda.time.LocalDate alignProposedBillCycleDate(final org.joda.time.LocalDate proposedDate, final int billingCycleDay) {
    final int lastDayOfMonth = proposedDate.dayOfMonth().getMaximumValue();
    int proposedBillCycleDate = proposedDate.getDayOfMonth();
    if (proposedBillCycleDate < billingCycleDay) {
        if (billingCycleDay <= lastDayOfMonth) {
            proposedBillCycleDate = billingCycleDay;
        }else {
            proposedBillCycleDate = lastDayOfMonth;
        }
    }
    return new org.joda.time.LocalDate(proposedDate.getYear(), proposedDate.getMonthOfYear(), proposedBillCycleDate, proposedDate.getChronology());
}