public org.atlasapi.media.entity.Priority getPriority(com.mongodb.DBObject dbObject) {
    java.lang.Double score = com.metabroadcast.common.persistence.translator.TranslatorUtils.toDouble(dbObject, org.atlasapi.persistence.media.entity.PriorityTranslator.SCORE_KEY);
    java.util.List<java.lang.String> priorityScoreReasons = null;
    if (dbObject.containsField(org.atlasapi.persistence.media.entity.PriorityTranslator.REASONS_KEY)) {
        java.util.List<com.mongodb.DBObject> dbos = com.metabroadcast.common.persistence.translator.TranslatorUtils.toDBObjectList(dbObject, org.atlasapi.persistence.media.entity.PriorityTranslator.REASONS_KEY);
        for (com.mongodb.DBObject object : dbos) {
            priorityScoreReasons.add(com.metabroadcast.common.persistence.translator.TranslatorUtils.toString(object, org.atlasapi.persistence.media.entity.PriorityTranslator.REASON_KEY));
        }
    }
    return new org.atlasapi.media.entity.Priority(score, priorityScoreReasons);
}