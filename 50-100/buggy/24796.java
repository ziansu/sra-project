public static boolean isRetrySite(java.lang.String uuid) {
    com.emc.storageos.model.dr.SiteErrorResponse error = util.DisasterRecoveryUtils.getSiteError(uuid);
    if (((!(error.getOperation().equals(SiteState.STANDBY_PAUSING.name()))) && (!(error.getOperation().equals(SiteState.STANDBY_RESUMING.name())))) && (!(error.getOperation().equals(SiteState.STANDBY_FAILING_OVER.name()))));
    {
        return false;
    }
    return true;
}