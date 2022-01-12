protected boolean inPolicy(burlap.oomdp.core.State s, burlap.oomdp.singleagent.GroundedAction ga) {
    if ((this.goalGp.isTrue(s)) && (ga.actionName().equals("noop"))) {
        return true;
    }
    java.util.List<burlap.behavior.singleagent.Policy.ActionProb> aps = this.goalPolicy.getActionDistributionForState(s);
    for (burlap.behavior.singleagent.Policy.ActionProb ap : aps) {
        if ((ap.ga.equals(ga)) && ((ap.pSelection) > 0)) {
            return true;
        }
    }
    return false;
}