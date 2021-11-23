private void cancelLobby() {
    if ((serv) != null) {
        serv.close();
    }
    playerList.remove(null);
    for (com.github.mrm1st3r.connection.bluetooth.SimpleBluetoothConnection conn : playerList.keySet()) {
        conn.write("quit");
        conn.close();
    }
    playerList.clear();
}