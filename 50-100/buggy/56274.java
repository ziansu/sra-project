@javax.annotation.CheckForNull
@org.kohsuke.accmod.Restricted(value = org.kohsuke.accmod.restrictions.NoExternalUse.class)
public jenkins.security.plugins.ldap.LDAPConfiguration getConfigurationFor(java.lang.String configurationId) {
    for (jenkins.security.plugins.ldap.LDAPConfiguration configuration : configurations) {
        if (configuration.isConfiguration(configurationId)) {
            return configuration;
        }
    }
    if (((configurations) != null) && ((configurations.size()) == 1)) {
        return configurations.get(0);
    }
    return null;
}