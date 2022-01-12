private void setUpCommandLineOptions() {
    commandLineOptions = new org.apache.commons.cli.Options();
    commandLineOptions.addOption(HOST_URL_OPTION, true, ("Host URL of transmartApp instance; for example: " + (EXAMPLE_URL)));
    commandLineOptions.addOption(STUDY_ID_OPTION, true, ("Study ID for listing; for example: " + (EXAMPLE_STUDY_ID)));
    commandLineOptions.getOption(HOST_URL_OPTION).setRequired(true);
    commandLineOptions.getOption(STUDY_ID_OPTION).setRequired(true);
}