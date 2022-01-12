public final java.util.List<ch.ethz.idsc.owly.glc.core.GlcNode> getNodesfromRootToGoal() {
    return ch.ethz.idsc.owly.data.tree.Nodes.fromRoot(((best) == null ? peek() : best));
}