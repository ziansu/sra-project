void remove(int x) {
    for (int i = 0; i < 52; i++) {
        if (((deckk[i]) != null) && ((deckk[i].nIndex) == x)) {
            deckk[i] = null;
            nDeckNum -= 1;
            break;
        }
    }
}