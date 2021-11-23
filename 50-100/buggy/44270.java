public boolean isLastCallIsCertError() {
    org.site_monitor.model.bo.SiteCall lastCall = getLastCall();
    if ((lastCall == null) || ((lastCall.getResult()) != (NetworkCallResult.FAIL))) {
        return false;
    }
    return lastCall.getException().startsWith(org.site_monitor.model.bo.SiteSettings.CERT_PATH_EXCEPTION);
}