@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    com.adonai.GsmNotify.database.PersistManager manager = com.adonai.GsmNotify.database.DbProvider.getTempHelper(this);
    try {
        manager.getHistoryDao().deleteBuilder().delete();
        if (com.adonai.GsmNotify.Utils.isTablet(this)) {
            getLoaderManager().getLoader(com.adonai.GsmNotify.SelectorActivity.STATUS_LOADER).onContentChanged();
        }
    } catch (java.sql.SQLException e) {
        android.widget.Toast.makeText(this, R.string.db_cant_delete_history, Toast.LENGTH_LONG).show();
    }
    com.adonai.GsmNotify.database.DbProvider.releaseTempHelper();
}