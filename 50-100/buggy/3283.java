private ddf.services.schematron.SchematronReport generateReport(java.lang.String metadata, javax.xml.transform.Templates validator) throws ddf.services.schematron.SchematronValidationException {
    java.io.StringReader metadataReader = new java.io.StringReader(metadata);
    ddf.services.schematron.SchematronReport report;
    try {
        javax.xml.transform.Transformer transformer = validator.newTransformer();
        javax.xml.transform.dom.DOMResult schematronResult = new javax.xml.transform.dom.DOMResult();
        transformer.transform(new javax.xml.transform.stream.StreamSource(metadataReader), schematronResult);
        report = new ddf.services.schematron.SvrlReport(schematronResult);
    } catch (javax.xml.transform.TransformerException e) {
        throw new ddf.services.schematron.SchematronValidationException("Could not setup validator to perform validation.");
    }
    return report;
}