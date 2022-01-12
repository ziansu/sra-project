private boolean isAppModule(java.lang.String basePath, java.lang.String moduleName) {
    java.io.File gradleBuildFile = new java.io.File(getModuleBuildFilePath(basePath, moduleName));
    java.lang.String[] fileLines = com.testfairy.plugin.intellij.Util.readFileLines(gradleBuildFile);
    java.lang.String line;
    int i = 0;
    while (i < (fileLines.length)) {
        line = fileLines[i];
        if ((line.contains("plugin")) && (line.contains("android"))) {
            return true;
        }
    } 
    return false;
}