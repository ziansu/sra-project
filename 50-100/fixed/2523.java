public static java.io.File moduleDir(com.intellij.openapi.module.Module module) {
    if (module == null)
        return null;
    
    java.lang.String pathname = com.thoughtworks.gauge.util.GaugeUtil.moduleDirPath(module);
    if (pathname != null)
        return new java.io.File(pathname);
    
    java.lang.String basePath = module.getProject().getBasePath();
    return basePath != null ? new java.io.File(basePath) : null;
}