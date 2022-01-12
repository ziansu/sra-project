private java.lang.String expectedLocation() {
    java.lang.String configurationDirectory = _configurationDirectory.substring(0, ((_configurationDirectory.length()) - 1));
    if (!(java.io.File.separator.equals("/"))) {
        configurationDirectory = configurationDirectory.replaceAll("/", java.util.regex.Matcher.quoteReplacement(java.io.File.separator));
    }
    return configurationDirectory;
}