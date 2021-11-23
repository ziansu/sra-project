private void init() throws joptsimple.OptionException {
    try {
        joptsimple.OptionParser parser = getOptionParser();
        options = parser.parse(this.getParameters());
    } catch (joptsimple.OptionException e) {
        stderr.append(e.getMessage()).append("\n");
        stderr.append(get_syntax()).append("\n");
        throw e;
    }
}