private void saveReport() {
    try (java.io.FileOutputStream out = new java.io.FileOutputStream(getReportFileName())) {
        workbookUtils.formatAsTable(0, rowNum, 0, ((reportHeaders.length) - 1));
        workbookUtils.autoAdjustColumnWidth(0, ((reportHeaders.length) - 1));
        report.write(out);
        (fileCounter)++;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}