private int stackDisplay(java.awt.Graphics g, day170717.solitaire.Card aCard) {
    int localy;
    if (aCard == null) {
        return y;
    }
    localy = stackDisplay(g, aCard.link);
    aCard.draw(g, x, localy);
    return localy + 35;
}