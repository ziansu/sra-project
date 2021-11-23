public static void clearSslSubjectAlternativeNameDomains() {
    org.mockserver.configuration.ConfigurationProperties.ALL_SUBJECT_ALTERNATIVE_DOMAINS.clear();
    org.mockserver.configuration.ConfigurationProperties.addSslSubjectAlternativeNameDomains(org.mockserver.configuration.ConfigurationProperties.readPropertyHierarchically("mockserver.sslSubjectAlternativeNameDomains", "localhost").split(","));
}