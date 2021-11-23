@java.lang.Override
public final java.util.Set<fr.uga.pddl4j.util.BitOp> getActionSet(final int time) {
    if (this.isTimeSpecifierOutOfBound(time)) {
        return null;
    }
    java.util.Set<fr.uga.pddl4j.util.BitOp> ts = new java.util.HashSet<>();
    ts.add(this.actions.get(time));
    return ts;
}