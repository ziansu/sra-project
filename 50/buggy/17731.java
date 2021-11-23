private java.lang.String getTemplatePath(java.lang.String templatePath) {
    java.lang.String path = "layout/" + templatePath;
    if (!(org.schemaspy.Config.getInstance().isJarFile())) {
        path = new java.io.File(templateDirectory, templatePath).getPath();
    }
    return path;
}