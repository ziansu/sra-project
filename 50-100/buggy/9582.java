public won.protocol.model.MatchingBehaviorType getMatchingBehaviorTypeForMatchedNeed(org.apache.solr.common.SolrDocument doc) {
    won.protocol.model.MatchingBehaviorType matchedNeedMatchingBehavior = won.protocol.model.MatchingBehaviorType.MUTUAL;
    java.lang.Object matchingBehaviorFieldValue = doc.getFieldValue(won.matcher.solr.hints.HintBuilder.MATCHING_BEHAVIOR_SOLR_FIELD);
    if (matchingBehaviorFieldValue == null) {
        matchedNeedMatchingBehavior = won.protocol.model.MatchingBehaviorType.fromURI(matchingBehaviorFieldValue.toString());
        if (matchedNeedMatchingBehavior == null) {
            matchedNeedMatchingBehavior = won.protocol.model.MatchingBehaviorType.MUTUAL;
        }
    }
    return matchedNeedMatchingBehavior;
}