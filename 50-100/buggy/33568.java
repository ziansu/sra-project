private boolean checkTrustConditions(java.lang.String key) {
    java.lang.String pre = ("trust.level." + key) + ".";
    return (this.autorEmail.matches(de.fraunhofer.igd.klarschiff.vo.Vorgang.settingsService.getPropertyValue((pre + "mail_match")))) && (((de.fraunhofer.igd.klarschiff.vo.Vorgang.settingsService.getPropertyValue((pre + "ldap_match")).length()) == 0) || ((this.securityService.getGroupsByUserEmailAndGroupMatcher(this.autorEmail, de.fraunhofer.igd.klarschiff.vo.Vorgang.settingsService.getPropertyValue((pre + "ldap_match"))).size()) > 0));
}