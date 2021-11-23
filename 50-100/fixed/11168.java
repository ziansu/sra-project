public int getMaxEggGroupID() {
    android.database.Cursor cursor = database.query(EGG_GROUPS_TABLE, null, null, null, null, null, null);
    cursor.moveToLast();
    int maxEggGroupID = cursor.getInt(cursor.getColumnIndex(EGG_GROUP_ID));
    if (PRINT_DEBUG)
        android.util.Log.v("Database Access", ("Max eggGroupID is: " + (java.lang.String.valueOf(maxEggGroupID))));
    
    cursor.close();
    return maxEggGroupID + 1;
}