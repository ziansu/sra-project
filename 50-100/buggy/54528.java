private int stackDisplay(final java.awt.Graphics g, final solitaire.Card aCard) {
    int localy;
    if (aCard == null) {
        return y;
    }
    localy = stackDisplay(g, aCard.link);
    aCard.draw(g, x, localy);
    if (((getSelectedCard()) != null) && (aCard == (getSelectedCard().top()))) {
        getSelectedCard().top();
        drawSelectCard(g);
    }
    return localy + 35;
}