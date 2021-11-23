@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    conn = new com.eca.assignment.game.BJDatabaseConn();
    conn.refreshPlayerData(player);
    panelGame.getJb_hit().setEnabled(true);
    panelGame.getJb_stand().setEnabled(true);
    panelGame.remove(panelGame.getOverlayPanel());
    initGame();
    panelGame.repaint();
}