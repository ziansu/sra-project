@java.lang.Override
public java.io.InputStream exportDatatypeLibraryDocumentAsHtml(gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.DatatypeLibraryDocument datatypeLibraryDocument, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportConfig exportConfig, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportFontConfig exportFontConfig) {
    if (datatypeLibraryDocument != null) {
        gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.util.ExportParameters exportParameters = exportUtil.setExportParameters(gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportServiceImpl.DOCUMENT_TITLE_DATATYPE_LIBRARY, true, false, gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportServiceImpl.EXPORT_FORMAT_HTML, exportConfig, exportFontConfig);
        return exportUtil.exportAsHtmlFromXsl(serializationService.serializeDatatypeLibrary(datatypeLibraryDocument).toXML(), gov.nist.healthcare.tools.hl7.v2.igamt.lite.service.impl.ExportServiceImpl.GLOBAL_STYLESHEET, exportParameters, datatypeLibraryDocument.getMetaData());
    }else {
        return new org.apache.commons.io.input.NullInputStream(1L);
    }
}