private void setTeamNames() {
    android.database.Cursor cursor = com.example.michael.archerygame.GameActivity.getGameContext().getContentResolver().query(android.content.ContentUris.withAppendedId(GameEntry.CONTENT_URI, gameId), null, null, null, null);
    try {
        if (cursor.moveToNext()) {
            com.example.michael.archerygame.TaskFragment.nameOfTeamA = cursor.getString(cursor.getColumnIndex(GameEntry.COLUMN_GAME_NAME_TEAM_A));
            com.example.michael.archerygame.TaskFragment.nameOfTeamB = cursor.getString(cursor.getColumnIndex(GameEntry.COLUMN_GAME_NAME_TEAM_B));
            return ;
        }
    } finally {
        cursor.close();
    }
    com.example.michael.archerygame.TaskFragment.nameOfTeamA = "Team A";
    com.example.michael.archerygame.TaskFragment.nameOfTeamB = "Team B";
}