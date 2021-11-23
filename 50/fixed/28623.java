@java.lang.Override
public void printReport(java.lang.String name, java.lang.String printer) {
    java.lang.String pdfFilePath = new com.chuckanutbay.print.ReportGenerator().generateReport(com.chuckanutbay.print.ReportUtil.getCompiledReportImportFilePath(name), new java.util.HashMap<java.lang.String, java.lang.Object>());
    com.chuckanutbay.print.Print.print(pdfFilePath, printer);
}