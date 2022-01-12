public void deleteCard(com.ske.minitrello.models.Card card) {
    dbHandler.deleteCard(card.getId());
    while (!(card.getComments().isEmpty())) {
        deleteComment(card.getComments().get(0));
    } 
    cardMap.remove(card.getId());
    com.ske.minitrello.models.CardList cardList = cardParent.get(card.getId());
    cardList.removeCard(card);
    cardParent.remove(card.getId());
}