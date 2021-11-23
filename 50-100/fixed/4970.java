@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent arg0) {
    markedLobby = lobby.getID();
    java.lang.System.out.println(markedLobby);
    if ((gametemp) != null) {
        gametemp.setBorder(null);
    }
    gametemp = game1;
    game1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, java.awt.Color.BLACK));
}