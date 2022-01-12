public static <T extends org.jenkinsci.test.acceptance.po.ToolInstallation> void installTool(org.jenkinsci.test.acceptance.po.Jenkins jenkins, java.lang.Class<T> type, java.lang.String name, java.lang.String version) {
    org.jenkinsci.test.acceptance.po.ToolInstallation.waitForUpdates(jenkins, type);
    jenkins.getPluginManager().checkForUpdates();
    org.jenkinsci.test.acceptance.po.ConfigurablePageObject tools = org.jenkinsci.test.acceptance.po.ToolInstallation.ensureConfigPage(jenkins);
    T maven = org.jenkinsci.test.acceptance.po.ToolInstallation.addTool(jenkins, type);
    maven.name.set(name);
    maven.installVersion(version);
    tools.save();
}