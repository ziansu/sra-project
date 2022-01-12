java.security.Principal[] getPrincipals(final java.security.ProtectionDomain pd) {
    if (pd instanceof org.apache.river.api.security.SubjectDomain) {
        final java.util.Set<java.security.Principal> principals = ((org.apache.river.api.security.SubjectDomain) (pd)).getSubject().getPrincipals();
        return ((java.security.Principal[]) (principals.toArray()));
    }
    return pd.getPrincipals();
}