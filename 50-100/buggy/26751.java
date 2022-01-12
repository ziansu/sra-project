public boolean simplEquals(java.lang.Object obj) {
    if (!(obj instanceof edu.hit.yh.gitdata.mine.module.SimpleBehavior)) {
        return false;
    }
    edu.hit.yh.gitdata.mine.module.SimpleBehavior simpleBehavior = ((edu.hit.yh.gitdata.mine.module.SimpleBehavior) (obj));
    if (((this.actor.equals(simpleBehavior.getActor())) && (isSameTarget(this.target, simpleBehavior.getTarget()))) && (this.eventType.equals(simpleBehavior.getEventType()))) {
        return true;
    }
    return false;
}