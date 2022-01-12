public void creaJPanelIntro() {
    removeAll();
    revalidate();
    repaint();
    setBackground(java.awt.Color.decode("#B3E5FC"));
    settaBottone(introGame, "introGame", mediator);
    settaBottone(introInfo, "introInfo", mediator);
    settaBottone(introContatti, "introContatti", mediator);
    settaBottone(introEsci, "introEsci", mediator);
}