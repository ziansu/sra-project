private static ca.uqac.lif.util.CliParser.ArgumentMap setupCommandLine(ca.uqac.lif.util.CliParser cli_parser, java.lang.String[] cli) {
    ca.uqac.lif.util.CliParser.ArgumentMap parsed = cli_parser.parse(cli);
    if (parsed == null) {
        java.lang.System.err.println("Error parsing command-line arguments");
        java.lang.System.exit(ca.uqac.lif.bullwinkle.BullwinkleCli.ERR_ARGUMENTS);
    }
    return parsed;
}