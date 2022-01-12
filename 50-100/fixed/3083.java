private void mapContext(alien4cloud.plugin.ManagedPlugin managedPlugin) {
    org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping mapper = new org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping();
    mapper.setApplicationContext(managedPlugin.getPluginContext());
    mapper.afterPropertiesSet();
    this.handlerMappings.add(mapper);
    this.pluginMappings.put(managedPlugin.getDescriptor().getId(), mapper);
}