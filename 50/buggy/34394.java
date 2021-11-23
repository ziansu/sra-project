public static com.dtolabs.rundeck.core.authorization.providers.Policies load(java.io.File rootPath, final java.util.Set<com.dtolabs.rundeck.core.authorization.providers.Attribute> forcedContext) {
    return new com.dtolabs.rundeck.core.authorization.providers.Policies(com.dtolabs.rundeck.core.authorization.providers.PoliciesCache.fromDir(rootPath));
}