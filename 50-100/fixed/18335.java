@java.lang.Override
public org.aiwolf.common.data.Agent divine() {
    if (!(semiwolves.isEmpty())) {
        java.util.Collections.shuffle(semiwolves);
        return semiwolves.get(0);
    }
    java.util.List<org.aiwolf.common.data.Agent> candidates = new java.util.ArrayList(agi.getAliveOthers());
    candidates.removeAll(werewolves);
    candidates.removeAll(humans);
    if (candidates.isEmpty()) {
        return null;
    }
    java.util.Collections.shuffle(candidates);
    return candidates.get(0);
}