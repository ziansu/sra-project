public org.mustangproject.ZUGFeRD.ZUGFeRDExporter loadFromPDFA1(byte[] pdfBinary) throws java.io.IOException {
    ensurePDFIsValidA1(new org.apache.pdfbox.preflight.utils.ByteArrayDataSource(new java.io.ByteArrayInputStream(pdfBinary)));
    org.mustangproject.ZUGFeRD.ZUGFeRDExporter zugFeRDExporter;
    try (org.apache.pdfbox.pdmodel.PDDocument doc = org.apache.pdfbox.pdmodel.PDDocument.load(pdfBinary)) {
        makePDFA3compliant(doc);
        zugFeRDExporter = new org.mustangproject.ZUGFeRD.ZUGFeRDExporter(doc);
    }
    return zugFeRDExporter;
}