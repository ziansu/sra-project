public void create(java.io.OutputStream oStream, java.util.Map<java.lang.String, java.io.InputStream> linkedWorkbooks, java.util.Map<java.lang.String, java.lang.String> linkedWorkbooksPasswords) throws org.zuinnote.hadoop.office.format.common.writer.OfficeWriterException {
    this.oStream = oStream;
    if ((this.currentOfficeSpreadSheetWriter) != null) {
        this.currentOfficeSpreadSheetWriter.create(oStream, linkedWorkbooks, linkedWorkbooksPasswords);
    }else {
        throw new org.zuinnote.hadoop.office.format.common.writer.OfficeWriterException(org.zuinnote.hadoop.office.format.common.OfficeWriter.EX_NO_WRITER_INSTANTIATED);
    }
}