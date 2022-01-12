@java.lang.Override
public boolean authorizeInteraction(java.util.Set<java.lang.String> grantedConsents) {
    java.util.Set<org.phenotips.data.Consent> systemConsents = this.consentManager.getSystemConsents();
    if (systemConsents == null) {
        return true;
    }
    java.util.Set<org.phenotips.data.Consent> missingConsents = new java.util.HashSet<org.phenotips.data.Consent>();
    for (org.phenotips.data.Consent consent : systemConsents) {
        if ((grantedConsents == null) || (!(grantedConsents.contains(consent.getId())))) {
            missingConsents.add(consent);
        }
    }
    return containsRequiredConsents(missingConsents);
}