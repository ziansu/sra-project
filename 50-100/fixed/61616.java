private void loadOpAuthMap(final java.util.Properties props) {
    final java.util.Set<java.lang.String> auths = new java.util.HashSet<>();
    for (final java.lang.String auth : props.getProperty(SystemProperty.FEDERATED_ADMIN_AUTH).split(uk.gov.gchq.gaffer.federated.rest.auth.FederatedConfigAuthoriser.AUTH_SEPARATOR)) {
        if (!(org.apache.commons.lang.StringUtils.isEmpty(auth))) {
            auths.add(auth);
        }
    }
    setOpAuths(auths);
}