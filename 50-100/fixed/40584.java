private int getNumericValueOf(org.apache.poi.ss.usermodel.Row row, int cellIndex) {
    try {
        return ((int) (row.getCell(cellIndex).getNumericCellValue()));
    } catch (java.lang.IllegalStateException e) {
        java.lang.System.out.println(((("Couldn't get value from row: " + (row.getRowNum())) + " / cell: ") + cellIndex));
        return 0;
    }
}