private boolean addBehaviorPatternCount(edu.hit.yh.gitdata.mine.module.SimpleBehavior simpleBehavior, java.util.List<edu.hit.yh.gitdata.mine.module.BehaviorPattern> preBehaviorPatterns) {
    for (edu.hit.yh.gitdata.mine.module.BehaviorPattern behaviorPattern : preBehaviorPatterns) {
        java.util.List<edu.hit.yh.gitdata.mine.module.AbstractActorBehavior> list = behaviorPattern.getBehaviorList();
        if (simpleBehavior.equals(list.get(0))) {
            behaviorPattern.addSurpport();
            return true;
        }
    }
    return false;
}