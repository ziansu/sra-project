private java.lang.Object processCellValue(java.lang.Object cellValue) {
    return cellValue.toString().replaceAll("'", "''");
}