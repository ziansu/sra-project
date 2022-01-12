private void checkSheetData(jxl.Sheet sheet, com.kamontat.checkidnumber.model.IDNumber[] ids) throws java.io.IOException, jxl.read.biff.BiffException {
    int i = 0;
    for (com.kamontat.checkidnumber.model.IDNumber id : ids) {
        jxl.Cell cellID = sheet.getCell(0, i);
        jxl.Cell cellName = sheet.getCell(1, i);
        long realID = java.lang.Long.parseLong(cellID.getContents());
        assertEquals((++i), realID);
        assertEquals(id.getId(), cellName.getContents());
    }
}