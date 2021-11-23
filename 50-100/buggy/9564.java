public void deleteCardList(com.ske.minitrello.models.CardList cardList) {
    dbHandler.deleteCardList(cardList.getName());
    for (com.ske.minitrello.models.Card card : cardList.getCards()) {
        deleteCard(card);
    }
    cardLists.remove(cardList);
    cardListMap.remove(cardList);
}