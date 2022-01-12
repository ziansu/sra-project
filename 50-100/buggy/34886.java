public void ShowMyHand() {
    for (int i = 0; i < (PlayerCards.size()); i++) {
        GreenCards g = ((GreenCards) (PlayerCards.get(i)));
        g.ShowImage(((((("Player" + (PlayerNumber)) + " (Card Index ") + (i + 1)) + ")  - ") + (g.GetName())));
    }
}