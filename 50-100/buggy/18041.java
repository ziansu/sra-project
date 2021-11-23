private android.database.Cursor getStatByPlayer(android.net.Uri uri, java.lang.String[] projection, java.lang.String sortOrder) {
    java.lang.String playerSetting = StatContract.StatEntry.getPlayerSettingFromUri(uri);
    java.lang.System.out.println(("playerSetting: " + playerSetting));
    java.lang.String[] selectionArgs;
    selectionArgs = new java.lang.String[]{ playerSetting };
    java.lang.String selection = tom.chinesesuperleague.data.StatProvider.sPlayerSettingSelection;
    java.lang.System.out.println(("player selection: " + selection));
    return mOpenHelper.getReadableDatabase().query(StatContract.StatEntry.TABLE_NAME, projection, selection, selectionArgs, null, null, sortOrder);
}