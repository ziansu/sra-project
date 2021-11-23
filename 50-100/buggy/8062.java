public final void start(final android.view.View v) {
    ((com.github.mrm1st3r.cards.Cards) (getApplication())).setConnections(playerList);
    for (com.github.mrm1st3r.connection.bluetooth.SimpleBluetoothConnection conn : playerList.keySet()) {
        conn.write("start");
        conn.pause();
    }
    serv.close();
    android.content.Intent intent = new android.content.Intent(this, com.github.mrm1st3r.cards.ingame.Gamemaster.class);
    startActivity(intent);
}