public void connectToServer() {
    if ((edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.DatabaseComs.sshTunnel) == null) {
        edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.DatabaseComs.sshTunnel = new edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.SSHDriver();
        edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.DatabaseComs.sshTunnel.connectViaSSH();
    }else
        if (!(edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.DatabaseComs.sshTunnel.isConnected())) {
            edu.gatech.slowroastingautoclaves.recommendr.databasedrivers.DatabaseComs.sshTunnel.connectViaSSH();
        }
    
}