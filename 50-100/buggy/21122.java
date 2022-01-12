private void addCards(int cardwidth) {
    com.amosli.game2048.Card c;
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            c = new com.amosli.game2048.Card(getContext());
            c.setNum(0);
            addView(c, cardwidth, cardwidth);
            cards[j][i] = c;
        }
    }
}