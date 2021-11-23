public void onClick(android.content.DialogInterface dialog, int id) {
    java.lang.String dbname = editTextFromDialog.getText().toString().trim();
    if (!(dropDatabase)) {
        android.util.Log.v("CREATEBUTTON", ("" + dbname));
        dbmanager = new com.gigigo.gigigocrud_sqliteandroid.Manager.SQLiteManager(getApplicationContext(), dbname);
        db = dbmanager.getWritableDatabase();
        databaseList.add(dbname);
    }else {
    }
    adapter.notifyDataSetChanged();
}