public void processDisconnect(in.voidma.classroom.network.core.network.login.server.SDisconnect packet) {
    this.client.setGui(new in.voidma.classroom.network.client.gui.DisconnectScreen(client));
}