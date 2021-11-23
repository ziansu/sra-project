public java.util.Map<java.lang.String, bg.registryagency.model.BrraCompany> parseAll() throws java.lang.Exception, javax.xml.bind.JAXBException {
    long start = java.lang.System.currentTimeMillis();
    initializeBrraJaxbContext();
    for (java.io.File file : getFilesFromDirectory(registryLocation)) {
        if (file.isFile()) {
            java.util.List<bg.registryagency.model.BrraCompany> parsedBrraCompanies = parseBrraXMLPage(file);
            updateCompanies(parsedBrraCompanies);
        }
    }
    createLogFile();
    long end = java.lang.System.currentTimeMillis();
    java.lang.System.out.println(("Time taken: " + ((end - start) / 1000.0)));
    return companies;
}