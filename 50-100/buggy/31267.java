@java.lang.Override
public void playerSelected(gui.playerselect.PlayerSelectDialog src) {
    if ((player1) == null) {
        player1 = src.getSelectedPlayer();
        src.setTitle("Player 2 Select");
        return ;
    }
    if ((player2) == null) {
        (player1.plays)++;
        (player2.plays)++;
        backend.Player.save();
        player2 = src.getSelectedPlayer();
        src.setVisible(false);
        board.setVisible(true);
        src.dispose();
    }
}