private void init() throws joptsimple.OptionException {
    java.lang.System.out.println("Init!");
    try {
        joptsimple.OptionParser parser = getOptionParser();
        options = parser.parse(this.getParameters());
    } catch (joptsimple.OptionException e) {
        stderr.append(e.getMessage());
        stderr.append(get_syntax());
        throw e;
    }
}