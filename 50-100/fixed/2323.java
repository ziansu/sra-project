public java.util.Map<java.lang.String, bg.registryagency.model.BrraCompany> parseAll() throws javax.xml.bind.JAXBException {
    initializeBrraJaxbContext();
    for (java.io.File file : getFilesFromDirectory(registryLocation)) {
        if (file.isFile()) {
            java.util.List<bg.registryagency.model.BrraCompany> parsedBrraCompanies = parseBrraXMLPage(file);
            updateCompanies(parsedBrraCompanies);
        }
    }
    return companies;
}