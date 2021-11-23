@org.thiki.kanban.cardTags.RequestMapping(value = "/boards/{boardId}/procedures/{procedureId}/cards/{cardId}/tags", method = RequestMethod.POST)
public org.springframework.http.HttpEntity stick(@org.thiki.kanban.cardTags.RequestBody
java.util.List<org.thiki.kanban.cardTags.CardTag> cardTags, @org.thiki.kanban.cardTags.PathVariable
java.lang.String boardId, @org.thiki.kanban.cardTags.PathVariable
java.lang.String procedureId, @org.thiki.kanban.cardTags.PathVariable
java.lang.String cardId, @org.thiki.kanban.cardTags.RequestHeader
java.lang.String userName) throws java.lang.Exception {
    java.util.List<org.thiki.kanban.cardTags.CardTag> stickCardTags = cardTagsService.stickTags(cardTags, cardId, boardId, userName);
    return org.thiki.kanban.foundation.common.Response.post(cardTagsResource.toResource(stickCardTags, boardId, procedureId, cardId, userName));
}