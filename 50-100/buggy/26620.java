public static org.apache.commons.cli.Options createOptions() {
    org.apache.commons.cli.Options options = new org.apache.commons.cli.Options();
    options.addOption("i", true, "Input thrift file");
    options.addOption("o", true, "Output file");
    options.addOption("p", true, "Parser (lingpipe or serif)");
    options.addOption("q", true, "Query");
    options.addOption("e", true, "External Collection");
    return options;
}