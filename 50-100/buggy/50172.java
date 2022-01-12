public void handlePlayerLogout(int id) {
    for (org.javajumper.saboteur.player.SPPlayer p : new java.util.ArrayList<org.javajumper.saboteur.player.SPPlayer>(players)) {
        if ((p.getId()) == id) {
            players.remove(p);
        }
    }
    for (org.javajumper.saboteur.player.DeadPlayer dp : new java.util.ArrayList<org.javajumper.saboteur.player.DeadPlayer>(deadplayers)) {
        if ((dp.getId()) == id) {
            deadplayers.remove(dp);
        }
    }
}