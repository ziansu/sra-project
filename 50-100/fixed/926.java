private boolean hasHelp() {
    org.apache.commons.cli.Options options = new lwjar.cli.OptionsBuilder().optional(Option.HELP).build();
    try {
        org.apache.commons.cli.CommandLine commandLine = new org.apache.commons.cli.DefaultParser().parse(options, this.arguments, true);
        return this.existsOption(commandLine, Option.HELP.shortName);
    } catch (org.apache.commons.cli.ParseException e) {
        throw new lwjar.cli.CommandLineOptionException(e.getMessage());
    }
}