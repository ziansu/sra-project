private void leaveLobby() {
    android.util.Log.d(com.github.mrm1st3r.cards.lobby.LobbyActivity.TAG, "leaving lobby");
    if ((conn) != null) {
        conn.setOnConnectionChangeHandler(null);
        conn.close();
        conn = null;
    }
    playerList.clear();
}