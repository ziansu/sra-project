public void outputToSQLFile(java.io.File file, java.lang.String databaseName, com.jeremy.SQLHandler.SQLType sqlType) throws java.io.IOException {
    java.lang.String output = new com.jeremy.SQLHandler(tblData).createSQLFile(databaseName, sqlType);
    try {
        com.jeremy.FileUtility.writeFile(file, output);
    } catch (java.io.IOException e) {
        if (logErrors) {
            com.jeremy.Logging.getInstance().log(java.util.logging.Level.SEVERE, "Error writing output to file!", e);
        }
        throw e;
    }
}