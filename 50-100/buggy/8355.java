private void initSheetWidthConfig(org.apache.poi.ss.usermodel.Sheet sheet) {
    xgt.util.excel.Config config = getConfig();
    sheet.setDefaultColumnWidth(((config.getDefaultWidth()) * 256));
    sheet.setDefaultRowHeightInPoints(config.getDefaultHeight());
    for (int index : config.getKeysOfWidth()) {
        sheet.setColumnWidth(index, ((config.getColumnWidth(index)) * 256));
    }
}