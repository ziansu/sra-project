private java.io.File detectPrivateHome(java.lang.String defaultPrivateHomeName) {
    final java.lang.String defaultPrivateHomePath = com.civilizer.config.Configurator.getDefaultPrivateHomePath(defaultPrivateHomeName);
    final java.lang.String privateHomePathByRuntimeArg = java.lang.System.getProperty(AppOptions.PRIVATE_HOME_PATH);
    if ((privateHomePathByRuntimeArg != null) && (!(privateHomePathByRuntimeArg.isEmpty()))) {
        final java.io.File f = new java.io.File(privateHomePathByRuntimeArg);
        if (!(f.isAbsolute())) {
            logger.warn("The specified home path \"%s\" is not absolute! it\'s error-prone!", privateHomePathByRuntimeArg);
        }
        return f;
    }
    return new java.io.File(defaultPrivateHomePath);
}