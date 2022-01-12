@java.lang.Override
public boolean requiresPassword(org.eclipse.datatools.connectivity.IConnectionProfile connectionProfile) {
    java.util.Properties props = connectionProfile.getBaseProperties();
    java.lang.String contextFactory = props.getProperty(ICredentialsCommon.SECURITY_TYPE_ID);
    if ((contextFactory != null) && (!(contextFactory.equalsIgnoreCase(IWSProfileConstants.SecurityType.None.name())))) {
        props.remove(ICredentialsCommon.USERNAME_PROP_ID);
        return true;
    }
    return false;
}