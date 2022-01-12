@com.google.common.annotations.VisibleForTesting
java.util.Map<java.lang.String, java.io.File> getStringFilesMap(java.lang.String webAppConfigurations) {
    if (webAppConfigurations == null) {
        return new java.util.HashMap<>();
    }
    return java.util.Arrays.stream(webAppConfigurations.split(",")).map(( propertyString) -> propertyString.split("=")).collect(java.util.stream.Collectors.toMap(( entry) -> entry[0], ( entry) -> new java.io.File(entry[1])));
}