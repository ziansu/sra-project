public void mouseClicked(java.awt.event.MouseEvent e) {
    game.SaveGame saveGame = new game.SaveGame();
    m_frame.getContentPane().removeAll();
    saveGame.loadGame(m_frame, menu);
}