private void addCards(int cardwidth) {
    com.amosli.game2048.Card c;
    for (int y = 0; y < 4; y++) {
        for (int x = 0; x < 4; x++) {
            c = new com.amosli.game2048.Card(getContext());
            c.setNum(0);
            addView(c, cardwidth, cardwidth);
            cards[x][y] = c;
        }
    }
}