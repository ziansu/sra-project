private int stackDisplay(final java.awt.Graphics g, final solitaire.Card aCard) {
    int localy;
    if (aCard == null) {
        return y;
    }
    localy = stackDisplay(g, aCard.link);
    aCard.draw(g, x, localy);
    return localy + 35;
}