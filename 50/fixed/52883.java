public java.io.InputStream exportAsDocxSections(gov.nist.healthcare.tools.hl7.v2.igamt.lite.domain.IGDocument ig) {
    if (ig != null) {
        return exportAsDocxFromXml(profileSerializationDocumentService.serializeSectionsToXML(ig), "/rendering/xml2html.xsl", true);
    }else {
        return new org.apache.commons.io.input.NullInputStream(1L);
    }
}