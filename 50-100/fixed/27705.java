@java.lang.Override
public <Trans extends com.loic.algo.search.core.Transition> java.util.List<Trans> find(com.loic.algo.search.core.State<Trans> root, int maxDeep) {
    java.util.Objects.requireNonNull(root, "Root state is mandatory");
    com.google.common.base.Preconditions.checkState((maxDeep > 0), "Max deep must bigger than 0");
    this.root = root;
    alphaBeta(root, maxDeep, java.lang.Double.MIN_VALUE, java.lang.Double.MAX_VALUE, true);
    java.util.List<Trans> path = com.google.common.collect.ImmutableList.of(((Trans) (bestTrans)));
    root = null;
    bestTrans = null;
    return path;
}