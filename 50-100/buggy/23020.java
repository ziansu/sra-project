private void optionCheck(ch.zhaw.file_operations.CommandLine cmd, java.lang.String option) {
    if (cmd.getOptionProperties(option).getProperty(cmd.getOptionValue(option)).equals("true")) {
        java.lang.System.err.println("\nWrong usage.\n");
        helpFormatter.printHelp("Podilize", options, true);
        java.lang.System.exit(1);
    }
}