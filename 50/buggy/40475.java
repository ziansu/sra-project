private java.lang.Object processCellValue(java.lang.Object cellValue) {
    java.lang.System.out.println(cellValue);
    return cellValue.toString().replaceAll("'", "''");
}