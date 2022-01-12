public static void main(java.lang.String[] args) throws java.io.IOException, javax.xml.parsers.ParserConfigurationException {
    if ((com.testhelper.CommandLineProcessor.validateCommandline(args)) == false) {
        java.lang.System.out.println(com.testhelper.CommandLineProcessor.errorMessage);
        java.lang.System.exit(0);
    }
    com.testhelper.Generator.getGenerator().setCommandLineConfiguration(args).generate();
}