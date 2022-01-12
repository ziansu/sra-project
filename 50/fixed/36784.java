public static void setLastExportTime(java.sql.Timestamp lastExportTime) {
    android.util.Log.v(org.gnucash.android.util.PreferencesHelper.LOG_TAG, "Saving last export time for the currently active book");
    org.gnucash.android.util.PreferencesHelper.setLastExportTime(lastExportTime, org.gnucash.android.db.adapter.BooksDbAdapter.getInstance().getActiveBookUID());
}