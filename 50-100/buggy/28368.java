@java.lang.Override
public void addBuildPlugin(final java.lang.String moduleName, final org.springframework.roo.project.Plugin plugin, boolean addToPluginManagement) {
    org.apache.commons.lang3.Validate.isTrue(isProjectAvailable(moduleName), "Plugin modification prohibited at this time");
    org.apache.commons.lang3.Validate.notNull(plugin, "Plugin required");
    addBuildPlugins(moduleName, java.util.Collections.singletonList(plugin));
}