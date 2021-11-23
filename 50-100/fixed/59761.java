private java.util.List<howardwu.io.ors.api.model.Questionnaire> wrapParticipantCounts(java.util.List<howardwu.io.ors.api.model.Questionnaire> questionnaires) {
    java.util.Map<java.lang.String, java.lang.Long> counts = howardwu.io.ors.api.common.utils.CollectionUtil.wrap(questionnaireSampleMapper.getParticipantCountsOfQuestionnaires(questionnaires));
    if (counts.isEmpty()) {
        return questionnaires;
    }
    for (howardwu.io.ors.api.model.Questionnaire questionnaire : questionnaires) {
        java.lang.Long count = counts.get(questionnaire.getIdentifier());
        if (count != null) {
            questionnaire.setParticipantCount(count);
        }
    }
    return questionnaires;
}