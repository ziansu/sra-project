@java.lang.Override
public void initializeGoApplicationAccessor(com.thoughtworks.go.plugin.api.GoApplicationAccessor goApplicationAccessor) {
    goPluginIdentifier = componentFactory.goPluginIdentifier();
    this.goApplicationAccessor = goApplicationAccessor;
    this.handlers = componentFactory.handlers();
}