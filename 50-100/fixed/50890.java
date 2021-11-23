protected org.hl7.fhir.utilities.xhtml.XhtmlNode parseXhtml(java.lang.String value) throws java.io.IOException, org.hl7.fhir.exceptions.FHIRFormatError {
    org.hl7.fhir.utilities.xhtml.XhtmlParser prsr = new org.hl7.fhir.utilities.xhtml.XhtmlParser();
    try {
        return prsr.parse(value, "div").getChildNodes().get(0);
    } catch (org.hl7.fhir.dstu3.formats.org.hl7.fhir.exceptions e) {
        throw new org.hl7.fhir.exceptions.FHIRFormatError(e.getMessage(), e);
    }
}