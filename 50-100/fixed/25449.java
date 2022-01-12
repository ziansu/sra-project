private static hudson.model.ItemGroup getItemGroup(java.lang.String path) {
    jenkins.model.Jenkins instance = jenkins.model.Jenkins.getInstance();
    java.lang.String normalizedPath = javaposse.jobdsl.plugin.LookupStrategy.normalizePath(path);
    if (normalizedPath == null) {
        return null;
    }
    if ((normalizedPath.isEmpty()) || (normalizedPath.equals("/"))) {
        return instance;
    }
    hudson.model.Item item = instance.getItemByFullName(normalizedPath);
    return item instanceof hudson.model.ItemGroup ? ((hudson.model.ItemGroup) (item)) : null;
}