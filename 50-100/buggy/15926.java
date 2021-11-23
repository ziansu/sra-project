private com.taozeyu.calico.generator.PageService createPageService(java.lang.String[] pathCells, java.lang.String extensionName) {
    int endOfExistDirIndex = findEndOfExistDirIndex(pathCells, extensionName);
    java.lang.String path = getTemplateDirPath(pathCells, endOfExistDirIndex);
    java.io.File templatePath = getTemplatePath(path, extensionName);
    if (templatePath == null) {
        return null;
    }
    java.lang.String params = selectParamsFromPath(pathCells, (endOfExistDirIndex + 1));
    return new com.taozeyu.calico.generator.PageService(resource, templatePath, routeDir, params);
}