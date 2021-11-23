@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    android.database.sqlite.SQLiteDatabase db = com.vladimircvetanov.smartfinance.db.DBAdapter.helper.getWritableDatabase();
    count[0] = db.delete(com.vladimircvetanov.smartfinance.db.DBAdapter.DbHelper.TABLE_NAME_FAVCATEGORIES, ((((com.vladimircvetanov.smartfinance.db.DBAdapter.DbHelper.FAVCATEGORIES_COLUMN_CATEGORYNAME) + " = ? AND ") + (com.vladimircvetanov.smartfinance.db.DBAdapter.DbHelper.FAVCATEGORIES_COLUMN_USERFK)) + " = ?"), new java.lang.String[]{ category.getName() , (com.vladimircvetanov.smartfinance.model.Manager.getLoggedUser().getId()) + "" });
    com.vladimircvetanov.smartfinance.db.DBAdapter.favouriteCategories.remove(category.getName());
    return null;
}