private boolean loadParserResult() {
    try {
        if (!(this.classDataLoaded)) {
            hudson.XmlFile file = getParserResultFile();
            if (file.exists()) {
                this.result = ((hudson.plugins.analysis.core.ParserResult) (file.read()));
                this.classDataLoaded = true;
                return true;
            }
        }
    } catch (java.io.IOException io) {
        java.lang.System.out.println(io);
    }
    return false;
}