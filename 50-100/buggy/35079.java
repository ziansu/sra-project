@java.lang.SuppressWarnings(value = "unchecked")
private java.util.List<java.lang.String> genearteRuntimeImportsFromJRELibrary() {
    if (com.sirap.basic.util.EmptyUtil.isNullOrEmpty(autoIncludedPackageNames)) {
        return java.util.Collections.EMPTY_LIST;
    }
    java.lang.String runtimeJarPath = com.sirap.basic.util.StrUtil.useSeparator(com.sirap.basic.util.ArisUtil.getRuntimeLibraryLocation(), "rt.jar");
    return com.sirap.geek.ArisExecutor.generateImportsByJarFile(runtimeJarPath, autoIncludedPackageNames);
}