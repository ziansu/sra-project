public static gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.io.File file) {
    return gr.ntua.ivml.edmvalidation.EdmSchemaValidator.validateAgainstEdm(new javax.xml.transform.stream.StreamSource(file), true, true);
}