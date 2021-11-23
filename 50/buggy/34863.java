public java.lang.String createFirstAccessionNumber(java.lang.String nullPrefix) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder(getPrefix());
    builder.append(us.mn.state.health.lims.common.util.DateUtil.getTwoDigitYear());
    builder.append(us.mn.state.health.lims.common.provider.validation.BaseSiteYearAccessionValidator.INCREMENT_STARTING_VALUE);
    return builder.toString();
}