@java.lang.Override
public java.math.BigDecimal calculatePenalty(final java.util.Date latestCollReceiptDate, final java.util.Date fromDate, final java.math.BigDecimal amount) {
    java.math.BigDecimal penalty = java.math.BigDecimal.ZERO;
    final int noOfMonths = (org.egov.ptis.client.util.PropertyTaxUtil.getMonthsBetweenDates(fromDate, new java.util.Date())) - 1;
    penalty = amount.multiply(PropertyTaxConstants.PENALTY_PERCENTAGE.multiply(new java.math.BigDecimal(noOfMonths))).divide(org.egov.ptis.constants.PropertyTaxConstants.BIGDECIMAL_100);
    return org.egov.infstr.utils.MoneyUtils.roundOff(penalty);
}