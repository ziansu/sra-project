private void gameOver() {
    sendFilesToServer(true);
    client.ClientCommands.Client_KillStarcraftAndChaoslauncher();
    client.ClientCommands.Client_KillExcessWindowsProccess(startingproc);
    client.ClientCommands.Client_CleanStarcraftDirectory();
}