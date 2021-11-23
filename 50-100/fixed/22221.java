public void receiveConnect() {
    iManager.getGameDatabase().setOnline(true, client.getUsername());
    java.lang.String[] command = new java.lang.String[]{ general.Constants.USERJOINED , client.getUsername() };
    iManager.getServerManager().sendToEveryone(command);
    reloadClientGUI();
}