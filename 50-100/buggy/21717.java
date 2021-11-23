private void displayDatabaseInfo() {
    com.example.android.pets.data.PetDbHelper mDbHelper = new com.example.android.pets.data.PetDbHelper(this);
    android.database.sqlite.SQLiteDatabase db = mDbHelper.getReadableDatabase();
    android.database.Cursor cursor = db.rawQuery(("SELECT * FROM " + (com.example.android.pets.data.PetContract.PetEntry.TABLE_NAME)), null);
    try {
        android.widget.TextView displayView = ((android.widget.TextView) (findViewById(R.id.text_view_pet)));
        displayView.setText(("Number of rows in pets database table: " + (cursor.getCount())));
    } finally {
        cursor.close();
    }
}