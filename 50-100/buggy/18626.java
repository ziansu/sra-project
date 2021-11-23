private static org.verapdf.metadata.fixer.utils.ValidationStatus getValidationStatus(org.verapdf.pdfa.results.ValidationResult result, org.verapdf.metadata.fixer.utils.parser.ProcessedObjectsParser parser) {
    org.verapdf.pdfa.validation.profiles.ValidationProfile profile = org.verapdf.metadata.fixer.MetadataFixerImpl.PROFILES.getValidationProfileByFlavour(result.getPDFAFlavour());
    if (profile != null) {
        try {
            return org.verapdf.metadata.fixer.utils.ProcessedObjectsInspector.validationStatus(result.getTestAssertions(), profile, parser);
        } catch (java.io.IOException | java.net.URISyntaxException | javax.xml.parsers.ParserConfigurationException | org.xml.sax.SAXException e) {
            org.verapdf.metadata.fixer.MetadataFixerImpl.LOGGER.debug("Problem with validation status obtain. Validation status set as Invalid Document.");
            org.verapdf.metadata.fixer.MetadataFixerImpl.LOGGER.debug(e);
            return org.verapdf.metadata.fixer.utils.ValidationStatus.INVALID_DOCUMENT;
        }
    }
    org.verapdf.metadata.fixer.MetadataFixerImpl.LOGGER.debug("Problem with validation status obtain. Validation status set as Invalid Metadata.");
    return org.verapdf.metadata.fixer.utils.ValidationStatus.INVALID_METADATA;
}