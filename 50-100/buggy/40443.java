private static void runXdocPublication(com.github.checkstyle.CliOptions cliOptions, java.util.List<java.lang.String> errors) {
    final com.github.checkstyle.publishers.XdocPublisher xdocPublisher = new com.github.checkstyle.publishers.XdocPublisher(((cliOptions.getOutputLocation()) + (com.github.checkstyle.Main.XDOC_FILENAME)), cliOptions.getLocalRepoPath(), cliOptions.getReleaseNumber(), cliOptions.isPublishXdocWithPush(), cliOptions.getAuthToken());
    try {
        xdocPublisher.publish();
    } catch (java.lang.Exception ex) {
        errors.add(ex.getMessage());
    }
}