@java.lang.Override
public void nextRow() throws com.example.netlog.util.DatabaseHandler.IImporter.ImportErrorException {
    try {
        tmp = com.example.netlog.util.DatabaseHandler.CsvImporter.advancedSplit(reader.readLine());
    } catch (java.io.IOException | java.lang.NullPointerException e) {
        com.example.netlog.util.GlobalFunctions.debug(e);
        throw new com.example.netlog.util.DatabaseHandler.IImporter.ImportErrorException();
    }
}