@java.lang.Override
public java.io.InputStream exportDatatypeLibraryDocumentAsDocx(gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.DatatypeLibraryDocument datatypeLibraryDocument, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportConfig exportConfig, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportFontConfig exportFontConfig) {
    if (datatypeLibraryDocument != null) {
        gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.util.ExportParameters exportParameters = exportUtil.setExportParameters(gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportServiceImpl.DOCUMENT_TITLE_DATATYPE_LIBRARY, true, true, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportServiceImpl.EXPORT_FORMAT_WORD, exportConfig, exportFontConfig);
        return exportUtil.exportAsDocxFromXml(serializationService.serializeDatatypeLibrary(datatypeLibraryDocument, exportConfig).toXML(), gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportServiceImpl.GLOBAL_STYLESHEET, exportParameters, datatypeLibraryDocument.getMetaData(), datatypeLibraryDocument.getDateUpdated());
    }else {
        return new org.apache.commons.io.input.NullInputStream(1L);
    }
}