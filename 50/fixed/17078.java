public void leaveLobby() {
    inLobby.set(false);
    lobbyName = "";
    java.lang.System.out.println("You left lobby.");
    send("LOBBY_LIST");
}