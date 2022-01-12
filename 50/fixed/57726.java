public void write(com.dua3.meja.model.Workbook workbook, java.io.BufferedWriter out) throws java.io.IOException {
    com.dua3.meja.io.CsvWorkbookWriter.writeSheets(workbook, com.dua3.meja.io.CsvWriter.create(out, getOptionsWithLocale(options, workbook)));
}