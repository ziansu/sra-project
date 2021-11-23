public static gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.io.InputStream is, boolean validateXsd, boolean validateSchematron) {
    return gr.ntua.ivml.edmvalidation.EdmSchemaValidator.validateAgainstEdm(new javax.xml.transform.stream.StreamSource(is), validateXsd, validateSchematron);
}