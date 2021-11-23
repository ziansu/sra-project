@java.lang.Override
public void updateBoardWithNewTableInfo(com.playxiangqi.hoxchess.TableInfo tableInfo) {
    android.util.Log.d(com.playxiangqi.hoxchess.NetworkTableActivity.TAG, "Update board with new network Table info (I_TABLE)...");
    tableId_ = tableInfo.tableId;
    setAndShowTitle(tableId_);
    invalidateOptionsMenu();
    referee_.resetGame();
    com.playxiangqi.hoxchess.BoardFragment boardFragment = myBoardFragment_.get();
    if (boardFragment != null) {
        boardFragment.resetBoard();
    }
    com.playxiangqi.hoxchess.PlayersFragment playersFragment = myPlayersFragment_.get();
    if (playersFragment != null) {
        playersFragment.refreshPlayersIfNeeded();
    }
}