@java.lang.Override
public void insertIntoTable(java.lang.String strTableName, java.util.Hashtable<java.lang.String, java.lang.String> htblColNameValue) throws exceptions.DBAppException {
    for (Arcookies.Table table : tables) {
        if ((table.getName()) == strTableName) {
            try {
                Arcookies.Page tempPage = table.insertIntoPage(htblColNameValue);
            } catch (java.lang.ClassNotFoundException | java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
}