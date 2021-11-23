private void createOverview(java.util.List<org.testng.ISuite> suites, java.io.File outputDirectory, boolean isIndex, boolean onlyFailures) throws java.lang.Exception {
    org.apache.velocity.VelocityContext context = createContext();
    context.put(org.uncommons.reportng.HTMLReporter.SUITES_KEY, suites);
    context.put(org.uncommons.reportng.HTMLReporter.ONLY_FAILURES_KEY, onlyFailures);
    context.put(org.uncommons.reportng.HTMLReporter.SCREENSHOT_DIRECTORY, "screenshot");
    context.put(org.uncommons.reportng.HTMLReporter.SCREENSHOT_HEIGHT, "30%");
    generateFile(new java.io.File(outputDirectory, (isIndex ? org.uncommons.reportng.HTMLReporter.INDEX_FILE : org.uncommons.reportng.HTMLReporter.OVERVIEW_FILE)), ((org.uncommons.reportng.HTMLReporter.OVERVIEW_FILE) + (TEMPLATE_EXTENSION)), context);
}