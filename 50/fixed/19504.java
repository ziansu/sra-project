public java.lang.Boolean isExperimentalEnabled() {
    return ((line) != null) && (line.hasOption(org.owasp.dependencycheck.CliParser.ARGUMENT.EXPERIMENTAL)) ? true : null;
}