@java.lang.Override
public void configureCluster(io.subutai.core.plugincommon.api.ConfigBase configBase, io.subutai.common.environment.Environment environment) throws io.subutai.core.plugincommon.api.ClusterConfigurationException {
    io.subutai.plugin.appscale.impl.ClusterConfiguration.LOG.info("ClusterConfiguration :: configureCluster ");
    io.subutai.plugin.appscale.api.AppScaleConfig config = ((io.subutai.plugin.appscale.api.AppScaleConfig) (configBase));
    if ("static".equals(config.getScaleOption())) {
        this.installAsStatic(configBase, environment);
    }else {
        this.installAsScale(configBase, environment);
    }
}