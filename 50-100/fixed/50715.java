private void move(int fieldID) throws java.lang.Exception {
    java.lang.String url = ((((((util.Settings.SERVER_ADDRESS) + "/api/move/") + (this.gameID)) + "/") + (main.GameClient.ai_name)) + "/") + fieldID;
    java.lang.System.out.print(main.GameClient.load(url));
}