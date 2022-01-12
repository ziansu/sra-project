public java.lang.String createFirstAccessionNumber(java.lang.String nullPrefix) {
    return ((getPrefix()) + (us.mn.state.health.lims.common.util.DateUtil.getTwoDigitYear())) + (us.mn.state.health.lims.common.provider.validation.BaseSiteYearAccessionValidator.INCREMENT_STARTING_VALUE);
}