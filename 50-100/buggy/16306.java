private void saveReport() {
    try (java.io.FileOutputStream out = new java.io.FileOutputStream(getReportFileName())) {
        workbookUtils.formatAsTable(rowNum, reportHeaders.length);
        workbookUtils.autoAdjustColumnWidth(0, ((reportHeaders.length) - 1));
        report.write(out);
        (fileCounter)++;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}