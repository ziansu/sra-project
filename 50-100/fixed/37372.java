private float match(com.vrublack.nutrition.core.CanonicalSearchableFoodItem item, java.lang.String queryComp) {
    float matchScore = 40 * (getPositionFactorForComponent(item.getPriorityForCanonicalComp(queryComp)));
    if (matchScore > 0)
        matchScore += (item.getRelativePopularity()) / 20;
    
    return matchScore;
}