private boolean addBehaviorPatternCount(edu.hit.yh.gitdata.mine.module.SimpleBehavior simpleBehavior, java.util.List<edu.hit.yh.gitdata.mine.module.BehaviorPattern> preBehaviorPatterns) {
    for (edu.hit.yh.gitdata.mine.module.BehaviorPattern behaviorPattern : preBehaviorPatterns) {
        java.util.List<edu.hit.yh.gitdata.mine.module.AbstractActorBehavior> list = behaviorPattern.getBehaviorList();
        if (list.get(0).equals(simpleBehavior)) {
            behaviorPattern.addSurpport();
            return true;
        }
    }
    return false;
}