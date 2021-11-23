private java.lang.String wrapWithAntPattern(java.lang.String path) {
    java.lang.String changedPath = path.replace(java.io.File.separator, "/");
    return ("**" + (surroundWithSeparator(changedPath).replace(java.io.File.separator, "/"))) + "**/";
}