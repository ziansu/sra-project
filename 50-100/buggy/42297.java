private static java.io.File ensurePropertyIsAbsolutePath(org.sonar.process.Props props, java.lang.String propKey) {
    java.io.File homeDir = props.nonNullValueAsFile(org.sonar.process.ProcessProperties.PATH_HOME);
    java.lang.String path = props.nonNullValue(propKey);
    java.io.File d = new java.io.File(path);
    if (!(d.isAbsolute())) {
        d = new java.io.File(homeDir, path);
        org.sonar.application.config.FileSystemSettings.LOG.trace("Overriding property {} from relative path '{}' to absolute path '{}'", path, d.getAbsolutePath());
        props.set(propKey, d.getAbsolutePath());
    }
    return d;
}