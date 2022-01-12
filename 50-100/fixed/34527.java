@org.springframework.cache.annotation.CacheEvict(value = "card-tag", key = "contains('#boardId')", allEntries = true)
public java.util.List<org.thiki.kanban.cardTags.CardTag> stickTags(java.util.List<org.thiki.kanban.cardTags.CardTag> cardTags, java.lang.String cardId, java.lang.String boardId, java.lang.String userName) {
    cardTagPersistence.removeTagsByCardId(cardId);
    for (org.thiki.kanban.cardTags.CardTag cardTag : cardTags) {
        cardTagPersistence.stick(cardId, cardTag, userName);
    }
    return cardTagPersistence.findByCardId(cardId);
}