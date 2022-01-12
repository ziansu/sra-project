private static java.lang.String getPrefix(org.apache.poi.ss.usermodel.Cell input) {
    if (input == null) {
        return "";
    }
    java.lang.String cellValue = input.getStringCellValue();
    if ((cellValue == null) || (cellValue.isEmpty())) {
        return "";
    }
    return cellValue.split("_")[0];
}