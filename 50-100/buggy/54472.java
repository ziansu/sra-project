public static boolean validateAuthProviderDomain(java.lang.String name) {
    java.lang.String domain = util.ACLUtils.extractDomainName(name);
    java.util.List<com.emc.storageos.model.auth.AuthnProviderRestRep> authnProviderRestReps = util.AuthnProviderUtils.getAuthProvidersByDomainName(domain);
    return (authnProviderRestReps != null) && ((authnProviderRestReps.size()) > 0);
}