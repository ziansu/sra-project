@java.lang.Override
public org.forgerock.opendj.config.server.ConfigChangeResult applyConfigurationAdd(C config) {
    final org.forgerock.opendj.config.server.ConfigChangeResult ccr = applyConfigurationAdd0(config);
    if ((ccr.getResultCode()) == (org.forgerock.opendj.ldap.ResultCode.SUCCESS)) {
        config.addChangeListener(((org.opends.server.admin.server.ConfigurationChangeListener) (this)));
    }
    return ccr;
}