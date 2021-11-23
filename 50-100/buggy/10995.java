public jxl.Sheet checkSheetName(jxl.Workbook workbook) throws java.io.IOException, jxl.read.biff.BiffException {
    assertTrue(((workbook.getSheets().length) > 0));
    for (java.lang.String name : workbook.getSheetNames()) {
        if (name.equals(getResources(activityTestRule).getString(R.string.default_sheet_name))) {
            return workbook.getSheet(name);
        }
    }
    workbook.close();
    return null;
}