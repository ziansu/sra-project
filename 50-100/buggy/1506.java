public void initialize() {
    for (int i = 0; i < 26; i++) {
        handCards[i] = new com.example.ryan.cards.Card("Empty");
    }
    for (int i = 0; i < 5; i++) {
        selected[i] = new com.example.ryan.cards.Card("Empty");
    }
}