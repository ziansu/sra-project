private static java.lang.String getPrefix(org.apache.poi.ss.usermodel.Cell input) {
    if (input == null) {
        return "";
    }
    java.lang.String cellValue = input.getStringCellValue();
    int indexOfUnderscore = cellValue.indexOf("_");
    if (indexOfUnderscore > (-1)) {
        return cellValue.substring(0, (indexOfUnderscore + 1));
    }
    return "";
}