private static boolean endWithParentDir(java.lang.String path) {
    if (org.apache.commons.lang3.StringUtils.isBlank(path))
        return true;
    
    if (((path.endsWith("..")) || (path.endsWith(".."))) || (path.endsWith("%2e%2e"))) {
        org.entando.entando.aps.system.services.storage.StorageManagerUtil._logger.info("Attack avoided - requested path {}", path);
        return false;
    }
    return true;
}