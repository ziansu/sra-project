private boolean loadParserResult() {
    try {
        hudson.XmlFile file = getParserResultFile();
        if (file.exists()) {
            this.result = ((hudson.plugins.analysis.core.ParserResult) (file.read()));
            return true;
        }
    } catch (java.io.IOException io) {
        java.lang.System.out.println(io);
    }
    return false;
}