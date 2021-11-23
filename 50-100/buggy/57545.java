public static java.lang.String getQuotedCellValue(com.incesoft.tools.excel.xlsx.Cell cell) {
    if (cell.isDate()) {
        java.util.Calendar cal = cell.getDateValue();
        if (null != cal) {
            return ("\"" + (com.incesoft.tools.excel.xlsx.ExcelUtils.sdf.format(cal.getTime()))) + "\"";
        }
    }
    return (cell.getValue().trim()) + "\"";
}