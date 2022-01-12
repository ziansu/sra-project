public void readMainElements() throws java.io.IOException {
    workbook = new org.apache.poi.hssf.usermodel.HSSFWorkbook(fileInputStream);
    org.apache.poi.hssf.usermodel.HSSFSheet sheet = workbook.getSheetAt(0);
    for (org.apache.poi.ss.usermodel.Row row : sheet) {
        java.util.Iterator cellIterator = row.cellIterator();
        java.lang.System.out.println(cellIterator.next().toString());
    }
}