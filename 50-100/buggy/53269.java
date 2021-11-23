public boolean isAuthTokenValid(java.lang.String username, java.lang.String ssid) {
    com.StudShare.domain.SiteUser siteUser = userManager.findUserByUsername(username);
    com.StudShare.domain.Token token = userManager.findTokenBySSID(ssid);
    if ((token != null) && (siteUser != null)) {
        if ((token.getSiteUser().getIdSiteUser()) == (siteUser.getIdSiteUser())) {
            return true;
        }
    }
    return false;
}