public void dealFour() {
    for (int i = 0; i < 4; i++) {
        int temp = deck.size();
        temp = temp - 1;
        models.Card temp_card = deck.get(temp);
        addCardToCol(i, temp_card);
        deck.remove(temp);
    }
}