public void disconnect() throws java.io.IOException {
    if (isConnected) {
        java.lang.System.out.println(("removing connection to: " + (this.socket)));
        this.bwriter.write((((net.ircapp.commands.Constants.server_quit) + " :Disconnecting") + (this.end)));
        this.bwriter.close();
        this.breader.close();
        this.socket.close();
        this.isConnected = false;
    }
}