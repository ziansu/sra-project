public static java.lang.String formatStringAsPercentage(final java.lang.String string) {
    if (org.apache.commons.lang.StringUtils.isBlank(string)) {
        return null;
    }
    final java.math.BigDecimal decimal = new java.math.BigDecimal(string).setScale(2, java.math.RoundingMode.HALF_DOWN);
    return org.sakaiproject.gradebookng.business.util.FormatHelper.formatDoubleAsPercentage(decimal.doubleValue());
}