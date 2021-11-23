@java.lang.Override
public org.forgerock.opendj.config.server.ConfigChangeResult applyConfigurationAdd(C config) {
    org.forgerock.opendj.config.server.ConfigChangeResult ccr = applyConfigurationAdd(config);
    if ((ccr.getResultCode()) == (org.forgerock.opendj.ldap.ResultCode.SUCCESS)) {
        config.addChangeListener(((org.opends.server.admin.server.ConfigurationChangeListener) (this)));
    }
    return applyConfigurationAdd0(config);
}