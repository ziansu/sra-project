public int findCard(java.lang.String name) {
    int index = -1;
    int cpt = 0;
    for (cardHandler.Card c : deck) {
        if (c.name.toLowerCase().equals(name.toLowerCase())) {
            index = cpt;
            break;
        }
        cpt++;
    }
    return index;
}