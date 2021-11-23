public void run() throws java.io.IOException {
    try {
        resourceBundler.generateResourceBundle();
    } catch (java.io.IOException e) {
        ch.silviowangler.i18n.cmd.CommandLineProcessor.LOGGER.error("Unable to generate resource bundle", e);
        throw e;
    }
    ch.silviowangler.i18n.cmd.CommandLineProcessor.LOGGER.info("Successfully ended process");
}