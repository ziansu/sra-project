public static java.lang.String getRuntimeValidAppName(java.lang.String applicationName) {
    if ((applicationName == null) || (applicationName.isEmpty())) {
        return null;
    }
    applicationName = applicationName.replaceAll("[^a-zA-Z0-9]+", "-");
    return applicationName;
}