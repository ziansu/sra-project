private static void createNewFile(java.util.List<com.github.mdjdrn1.translator.utils.Pair<java.lang.String, java.lang.String>> words, java.lang.String xlsOutputFilePath) {
    try {
        java.io.FileOutputStream file = new java.io.FileOutputStream(xlsOutputFilePath);
        org.apache.poi.ss.usermodel.Workbook workbook = new org.apache.poi.xssf.usermodel.XSSFWorkbook();
        org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet();
        com.github.mdjdrn1.translator.App.addWordsToSheet(words, sheet);
        workbook.write(file);
        file.flush();
        file.close();
    } catch (java.io.IOException e) {
        throw new com.github.mdjdrn1.translator.exceptions.WritingFileError("Writing new file failed.");
    }
}