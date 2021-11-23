private com.smoke.dto.SmokeHttpWrapperDTO[] prepareForLaunch() {
    org.apache.poi.xssf.usermodel.XSSFWorkbook workBook = new org.apache.poi.xssf.usermodel.XSSFWorkbook();
    int numberOfSheets = workBook.getNumberOfSheets();
    return prepareRequestFromSheet(workBook.getSheetAt(0));
}