public static java.lang.String propertySettingsFilePath(java.lang.String projectName, java.lang.String className, java.lang.String propertyName) {
    className = fr.pco.accenture.utils.Helper.stringAfter(className, "#");
    propertyName = fr.pco.accenture.utils.Helper.stringAfter(propertyName, "#");
    return (((fr.pco.accenture.utils.Files.classFolderPath(projectName, className)) + (java.io.File.separator)) + propertyName) + ".json";
}