public void addTrainCard(com.example.tyudy.ticket2rideclient.common.cards.TrainCardCollection card) {
    com.example.tyudy.ticket2rideclient.common.cards.TrainCardCollection c = colorCards.get(card.getColor());
    if (c != null) {
        c.incNum();
        colorCards.put(card.getColor(), c);
    }else {
        colorCards.put(card.getColor(), card);
    }
}