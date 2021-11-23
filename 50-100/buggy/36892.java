public org.apache.commons.cli.Options getCliOptions() {
    if ((cliOptions) == null) {
        return new org.apache.commons.cli.Options();
    }
    if (((((cliOptions) != null) && (!(cliOptions.hasOption("h")))) && (!(cliOptions.hasLongOption("help")))) && (isDefaultHelpEnabled())) {
        cliOptions.addOption("h", "help", false, "Shows this message");
    }
    return cliOptions;
}