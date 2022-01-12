public void initialize() {
    for (int i = 0; i < 26; i++) {
        handCards[i] = new com.example.ryan.cards.Card(0, 0);
    }
    for (int i = 0; i < 5; i++) {
        selected[i] = new com.example.ryan.cards.Card(0, 0);
    }
}