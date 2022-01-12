@org.thiki.kanban.card.RequestMapping(value = "/boards/{boardId}/procedures/{procedureId}/cards/sortNumbers", method = RequestMethod.PUT)
public org.springframework.http.HttpEntity resortCards(@org.thiki.kanban.card.RequestBody
java.util.List<org.thiki.kanban.card.Card> cards, @org.thiki.kanban.card.PathVariable
java.lang.String boardId, @org.thiki.kanban.card.PathVariable
java.lang.String procedureId, @org.thiki.kanban.card.RequestHeader
java.lang.String userName) throws java.lang.Exception {
    java.util.List<org.thiki.kanban.card.Card> sortedCards = cardsService.resortCards(cards, procedureId, boardId);
    return org.thiki.kanban.foundation.common.Response.build(cardsResource.toResource(sortedCards, boardId, procedureId, userName));
}