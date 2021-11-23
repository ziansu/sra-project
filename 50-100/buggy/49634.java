public void deleteCard(com.ske.minitrello.models.Card card) {
    dbHandler.deleteCard(card.getId());
    for (com.ske.minitrello.models.Comment comment : card.getComments()) {
        deleteComment(comment);
    }
    cardMap.remove(card.getId());
    com.ske.minitrello.models.CardList cardList = cardParent.remove(card.getId());
    cardList.removeCard(card);
}