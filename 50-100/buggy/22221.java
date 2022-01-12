public void receiveConnect() {
    iManager.printError("User verbindet sich");
    iManager.getGameDatabase().setOnline(true, client.getUsername());
    java.lang.String[] command = new java.lang.String[]{ general.Constants.USERJOINED , client.getUsername() };
    iManager.getServerManager().sendToEveryone(command);
    reloadClientGUI();
}