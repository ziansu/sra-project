private android.database.Cursor getAllItemsFromCharacter(long id) {
    db = this.getReadableDatabase();
    java.lang.String[] selection = new java.lang.String[]{ java.lang.String.valueOf(id) };
    android.database.Cursor cursor = db.rawQuery((((((((((("SELECT * FROM " + (com.bam.darkhouseextreme.app.helper.DatabaseHelper.ITEM_TABLE_NAME)) + " AS I JOIN ") + (com.bam.darkhouseextreme.app.helper.DatabaseHelper.PLAYER_ITEM_JUNCTION_TABLE_NAME)) + " AS PI ON I.") + (com.bam.darkhouseextreme.app.helper.DatabaseHelper.ITEM_ID)) + " = PI.") + (com.bam.darkhouseextreme.app.helper.DatabaseHelper.JUNCTION_TABLE_ITEM_ID)) + " WHERE PI.") + (com.bam.darkhouseextreme.app.helper.DatabaseHelper.JUNCTION_TABLE_PLAYER_ID)) + " = ?"), selection);
    return cursor;
}