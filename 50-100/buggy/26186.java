private java.lang.String get_syntax() {
    joptsimple.OptionParser parser = getOptionParser();
    java.io.StringWriter output = new java.io.StringWriter();
    try {
        parser.printHelpOn(output);
        return output.toString();
    } catch (java.io.IOException e) {
        stderr.append(e.getMessage());
        return e.getMessage();
    }
}