@org.jetbrains.annotations.NotNull
private static java.util.List<java.lang.String> getCustomValuesDir(com.intellij.openapi.project.Project project) {
    com.intellij.ide.util.PropertiesComponent properties = com.intellij.ide.util.PropertiesComponent.getInstance(project);
    java.lang.String valuesString = properties.getValue(Configuration.CUSTOM_VALUES_DIR_KEY, "");
    java.lang.String[] dirs = valuesString.split(Configuration.CUSTOM_VALUES_DIR_SEPARATOR);
    return java.util.Arrays.asList(dirs);
}