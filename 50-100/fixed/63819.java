public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(org.mercycorps.translationcards.DbManager.DbHelper.INIT_DECKS_SQL);
    db.execSQL(org.mercycorps.translationcards.DbManager.DbHelper.INIT_DICTIONARIES_SQL);
    db.execSQL(org.mercycorps.translationcards.DbManager.DbHelper.INIT_TRANSLATIONS_SQL);
    long creationTimestamp = new java.util.Date().getTime();
    long defaultDeckId = addDeck(db, context.getString(R.string.data_default_deck_name), context.getString(R.string.data_default_deck_publisher), creationTimestamp, null, null);
    populateIncludedData(db, defaultDeckId);
}