public int deleteData_From_Table(java.lang.String tbName) {
    int result = 0;
    try {
        if (!(database.isOpen())) {
            openDataBase();
        }
        database.beginTransaction();
        result = database.delete(tbName, null, null);
        if (result >= 0) {
            database.setTransactionSuccessful();
        }
    } catch (java.lang.Exception e) {
        database.endTransaction();
        close();
    } finally {
        database.endTransaction();
        close();
    }
    return result;
}