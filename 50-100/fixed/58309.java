public void process() {
    java.lang.String game_id = app.getGameID();
    if (game_id != null) {
        java.lang.String xmlString = (((xml.Message.requestHeader()) + "<showGameStateRequest gameId='") + game_id) + "'/></request>";
        xml.Message m = new xml.Message(xmlString);
        app.getServerAccess().sendRequest(m);
    }
}