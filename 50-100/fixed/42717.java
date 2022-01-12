void append(int x) {
    for (int i = 0; i < 52; i++) {
        if ((deckk[i]) == null) {
            deckk[i] = new P.EachCard(x);
            nDeckNum += 1;
            break;
        }
    }
}