public void creaJPanelIntro() {
    removeAll();
    revalidate();
    repaint();
    settaBottone(introGame, "introGame", mediator);
    settaBottone(introInfo, "introInfo", mediator);
    settaBottone(introContatti, "introContatti", mediator);
    settaBottone(introEsci, "introEsci", mediator);
}