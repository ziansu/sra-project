public void drawComponents() {
    m_board.removeAll();
    m_board.updateUI();
    setupplayers();
    setuptiles();
    m_frame.revalidate();
}