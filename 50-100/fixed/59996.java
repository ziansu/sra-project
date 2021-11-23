public io.swagger.config.SwaggerConfig getConfig() {
    java.lang.String configIdKey;
    if ((configId) != null) {
        configIdKey = (io.swagger.config.SwaggerConfig.CONFIG_ID_PREFIX) + (configId);
    }else {
        if ((sc) != null) {
            configIdKey = ((sc.getInitParameter(SwaggerConfig.CONFIG_ID_KEY)) != null) ? (io.swagger.config.SwaggerConfig.CONFIG_ID_PREFIX) + (sc.getInitParameter(SwaggerConfig.CONFIG_ID_KEY)) : io.swagger.config.SwaggerConfig.CONFIG_ID_DEFAULT;
        }else {
            configIdKey = io.swagger.config.SwaggerConfig.CONFIG_ID_DEFAULT;
        }
    }
    return io.swagger.jaxrs.config.SwaggerConfigLocator.getInstance().getConfig(configIdKey);
}