private boolean loadParserResult() {
    try {
        hudson.XmlFile file = getParserResultFile();
        if ((file.exists()) && (!(this.classDataLoaded))) {
            this.result = ((hudson.plugins.analysis.core.ParserResult) (file.read()));
            this.classDataLoaded = true;
            return true;
        }
    } catch (java.io.IOException io) {
        java.lang.System.out.println(io);
    }
    return false;
}