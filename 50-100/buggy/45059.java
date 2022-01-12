public java.util.ArrayList<android.content.ContentValues> getDataFromCache(java.lang.String tableName) {
    com.smart.framework.SmartUtils.showProgressDialog(context, null, false);
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