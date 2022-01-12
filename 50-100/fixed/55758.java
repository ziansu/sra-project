private java.lang.String expectedLocation() {
    java.lang.String configurationDirectory = _configurationDirectory.substring(0, ((_configurationDirectory.length()) - 1));
    if (!("/".equals(java.io.File.separator))) {
        configurationDirectory = configurationDirectory.replaceAll("/", java.util.regex.Matcher.quoteReplacement(java.io.File.separator));
    }
    return configurationDirectory;
}