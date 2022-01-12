private com.taozeyu.calico.generator.PageService createPageService(java.lang.String[] pathCells, java.lang.String extensionName) {
    int endOfExistDirIndex = findEndOfExistDirIndex(pathCells, extensionName);
    if (endOfExistDirIndex != (-1)) {
        java.lang.String path = getTemplateDirPath(pathCells, endOfExistDirIndex);
        java.lang.String validPagePath = findValidPagePath(path, extensionName);
        if (validPagePath != null) {
            java.lang.String params = selectParamsFromPath(pathCells, (endOfExistDirIndex + 1));
            return new com.taozeyu.calico.generator.PageService(runtimeContext, resource, validPagePath, params);
        }
    }
    return null;
}