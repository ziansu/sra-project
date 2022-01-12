public int findCard(java.lang.String name) {
    int index = -1;
    int cpt = 0;
    for (cardHandler.Card c : deck) {
        if (c.name.equals(name)) {
            index = cpt;
            break;
        }
        cpt++;
    }
    return index;
}