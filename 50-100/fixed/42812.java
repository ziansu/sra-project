public void delete(java.lang.String ward, java.lang.String area, demo.kolorob.kolorobdemoversion.model.CommonModel commonModel) {
    demo.kolorob.kolorobdemoversion.database.CommonDBTable commonDBTable = new demo.kolorob.kolorobdemoversion.database.CommonDBTable(tContext);
    commonDBTable.delete(ward, area);
    demo.kolorob.kolorobdemoversion.database.DatabaseHelper databaseHelper = new demo.kolorob.kolorobdemoversion.database.DatabaseHelper(tContext);
    android.database.sqlite.SQLiteDatabase database = databaseHelper.getWritableDatabase();
    database.delete(demo.kolorob.kolorobdemoversion.database.Education.EduNewDBTableMain.TABLE_NAME, (((demo.kolorob.kolorobdemoversion.database.Education.EduNewDBTableMain.KEY_COMMON_ID) + " = ") + (commonModel.getId())), null);
    database.close();
}