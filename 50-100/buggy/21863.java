private void init() {
    java.util.Properties prop = net.jplugin.common.kits.PropertiesKit.loadProperties(((net.jplugin.core.kernel.api.PluginEnvirement.getInstance().getConfigDir()) + "/log4j.properties"));
    net.jplugin.common.kits.PropertiesKit.replaceVar(prop, PluginEnvirement.WORK_DIR, java.lang.System.getProperty(net.jplugin.core.kernel.api.PluginEnvirement.getInstance().getWorkDir()));
    org.apache.log4j.PropertyConfigurator.configure(prop);
}