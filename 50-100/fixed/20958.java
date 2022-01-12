private void createOptions() {
    options.addOption("l", "list", true, "a comma-separated list of subject areas");
    options.addOption("u", "udml", true, "a UDML file");
    options.addOption("x", "rpdxml", true, "the resulting XML file, if left unspecified a random name will be set");
    options.addOption("s", "udmlxsl", true, "XSL stylesheet for (optional) transformation");
    options.addOption("t", "udmltgt", true, "the file resulting from the transformation, if left unspecified a random name will be set");
    options.addOption("c", "cmd", true, "invokes a bundled utility such as the Bus Matrix Generator");
    options.addOption("h", "help", false, "displays valid command line arguments");
}