private java.lang.String getGroupsFromNumberValue(main.xls.poi.HSSFCell cell) {
    java.lang.String stringValue = java.lang.String.valueOf(cell.getNumericCellValue());
    java.lang.String[] splittedString = stringValue.split("[,|.]");
    if ((((splittedString.length) == 2) && ((splittedString[1]) != "0")) && ((java.lang.Integer.valueOf(splittedString[0])) > (java.lang.Integer.valueOf(splittedString[1])))) {
        stringValue += "0";
    }
    return stringValue;
}