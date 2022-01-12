@java.lang.Override
public void playerSelected(gui.playerselect.PlayerSelectDialog src) {
    if ((player1) == null) {
        player1 = src.getSelectedPlayer();
        src.setTitle("Player 2 Select");
        return ;
    }
    if ((player2) == null) {
        player2 = src.getSelectedPlayer();
        (player1.plays)++;
        (player2.plays)++;
        backend.Player.save();
        src.setVisible(false);
        board.setVisible(true);
        src.dispose();
    }
}