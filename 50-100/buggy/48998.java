public boolean lotteryEligibilityStatusRefreshRequired() {
    com.codaconsultancy.cclifeline.domain.Configuration byName = configurationRepository.findByName(com.codaconsultancy.cclifeline.service.LAST_ELIGIBILITY_REFRESH_DATE);
    java.util.Date lastRefresh = byName.getDateValue();
    boolean isRefreshRequired = configurationRepository.findByName(com.codaconsultancy.cclifeline.service.ELIGIBILITY_REFRESH_REQUIRED).getBooleanValue();
    org.joda.time.DateTime now = org.joda.time.DateTime.now();
    org.joda.time.DateTime lastRefreshDate = new org.joda.time.DateTime(lastRefresh);
    org.joda.time.Duration durationSinceLastRefresh = new org.joda.time.Duration(lastRefreshDate, now);
    return ((durationSinceLastRefresh.getStandardHours()) > 24) || isRefreshRequired;
}