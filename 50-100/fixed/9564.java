public void deleteCardList(com.ske.minitrello.models.CardList cardList) {
    dbHandler.deleteCardList(cardList.getName());
    while (!(cardList.getCards().isEmpty())) {
        deleteCard(cardList.getCards().get(0));
    } 
    cardLists.remove(cardList);
    cardListMap.remove(cardList);
}