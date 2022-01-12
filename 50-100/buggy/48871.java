public void init() {
    cardList.clear();
    for (java.lang.String mark : cardMark) {
        for (int i = 0; i < 13; i++) {
            com.freshpeople.training.blackjack.Card card = new com.freshpeople.training.blackjack.Card(mark, i);
            cardList.add(card);
        }
    }
}