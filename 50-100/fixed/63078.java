@org.robotframework.javalib.annotation.RobotKeyword(value = "Exports the data from the given table into a file that is stored at the " + (((((((((((("given location. The where-clause can (and should) be used to narrow the " + "amount of rows that is exported this way. The file is stored in some ") + "simple XML-format and can be imported again to the database using the ") + "\"Import Data From File\" keyword. This way it is possible to store a set ") + "of testdata permanently retrieving it for example from some Live- or ") + "Demosystem. This keyword will probably have some issues if millions of ") + "rows are exported/imported using it. ") + "\n\n") + "*NOTE*: If using keyword remotely, file need to be trasfered to server some ") + "other way; this library is not doing the transfer.\n\n") + "The keyword returns the amount of rows written to the XML-file. ") + "\n\n") + "Example: | ${ROWSEXPORTED}= | MySampleTable | /tmp/mysampletable.xml | Timestamp > sysdate-50 |"))
@org.robotframework.javalib.annotation.ArgumentNames(value = { "Table name" , "Export file path (including name)" , "Where clause=''" })
public int exportDataFromTable(java.lang.String tableName, java.lang.String filePath, java.lang.String... whereClause) throws com.github.hi_fi.dblibrary.keywords.DatabaseLibraryException, java.sql.SQLException, javax.xml.parsers.ParserConfigurationException, javax.xml.transform.TransformerException, javax.xml.transform.TransformerFactoryConfigurationError {
    new com.github.hi_fi.dblibrary.keywords.Assert().tableMustExist(tableName);
    java.lang.String query = "Select * from " + tableName;
    if ((whereClause.length) > 0) {
        query += " where " + (whereClause[0]);
    }
    java.util.List<java.util.HashMap<java.lang.String, java.lang.Object>> data = queryRunner.executeSql(query);
    return writeQueryResultsToFile(tableName, filePath, data);
}