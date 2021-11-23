private void startUpdateThread() {
    java.util.Timer updateTimer = new java.util.Timer("Ping for lobby updates");
    updateTimer.schedule(new java.util.TimerTask() {
        @java.lang.SuppressWarnings(value = "unchecked")
        public void run() {
            currentUsers = ((java.util.Vector<orbit.User>) (com.orbit.game.desktop.Orbit.sendRequest(new orbit.ServerRequest("Get User List", null))));
            if ((currentUsers) != null) {
                updateLobbyAvis();
            }
            for (com.orbit.game.desktop.LobbyWindow.JAviPanel jap : aviPanels) {
                jap.revalidate();
                jap.repaint();
            }
        }
    }, 0, 3000);
}