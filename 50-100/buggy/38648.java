private com.devingotaswitch.rankings.domain.Player loadPlayerCustomFields(android.database.sqlite.SQLiteDatabase db, com.devingotaswitch.rankings.domain.Player player) {
    android.database.Cursor result = getMultiKeyEntry(db, Constants.PLAYER_NAME_COLUMN, Constants.PLAYER_POSITION_COLUMN, sanitizePlayerName(player.getName()), player.getPosition(), Constants.PLAYER_CUSTOM_TABLE_NAME);
    player = com.devingotaswitch.utils.DBUtils.cursorToCustomPlayer(result, player);
    result.close();
    return player;
}