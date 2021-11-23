private org.joda.time.LocalDate alignProposedBillCycleDate(final org.joda.time.LocalDate proposedDate) {
    final int lastDayOfMonth = proposedDate.dayOfMonth().getMaximumValue();
    int proposedBillCycleDate = proposedDate.getDayOfMonth();
    if ((proposedBillCycleDate < (billingCycleDay)) && ((billingCycleDay) <= lastDayOfMonth)) {
        proposedBillCycleDate = billingCycleDay;
    }
    return new org.joda.time.LocalDate(proposedDate.getYear(), proposedDate.getMonthOfYear(), proposedBillCycleDate, proposedDate.getChronology());
}