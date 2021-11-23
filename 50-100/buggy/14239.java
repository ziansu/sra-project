private static java.util.List<java.lang.String> getValuesDir(com.intellij.openapi.project.Project project) {
    java.util.List<java.lang.String> dirs = Configuration.getCustomValuesDir(project);
    if ((dirs.size()) > 0) {
        return dirs;
    }else {
        return Configuration.getDefaultValuesDir(project);
    }
}