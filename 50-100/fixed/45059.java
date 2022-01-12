public java.util.ArrayList<android.content.ContentValues> getDataFromCache(java.lang.String tableName) {
    try {
        java.util.ArrayList<android.content.ContentValues> tableRows = getDBHelper().getTableList().get(tableName).readRowSQL((("SELECT * FROM " + tableName) + ""), null);
        com.smart.framework.SmartUtils.hideProgressDialog();
        return tableRows;
    } catch (java.lang.Throwable e) {
        com.smart.framework.SmartUtils.hideProgressDialog();
        e.printStackTrace();
    }
    return null;
}