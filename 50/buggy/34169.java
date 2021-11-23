public static void main(java.lang.String[] args) throws java.lang.Exception {
    java.lang.String propertiesFilePathName = null;
    if ((args.length) > 0) {
        propertiesFilePathName = args[0].trim();
    }
    com.abb.soapui.SoapUIProjectFile.processFiles("C:\\whennemuth\\documentation\\abb\\soapui\\SoapUILocalizer.properties");
}