public void startServer() {
    mConnectionState = ServerConnectionState.DISCONNECTED;
    ((unimelb.distributed_algo_game.player.SlavePlayer) (mPlayer)).restartServer();
    javax.swing.JPanel panel = ((unimelb.distributed_algo_game.player.SlavePlayer) (mPlayer)).getPanel();
    ((unimelb.distributed_algo_game.network.gui.MainGameLoginClientPanel) (panel)).updateGameTable(mPlayerClientManager.getPlayerIDList(), true);
}