public void visit(jetbrains.mps.smodel.SNode it) {
    junit.framework.Assert.assertEquals(null, jetbrains.mps.lang.test.matcher.NodesMatcher.matchNodes(jetbrains.mps.internal.collections.runtime.ListSequence.fromListAndArray(new java.util.ArrayList<jetbrains.mps.smodel.SNode>(), it), jetbrains.mps.internal.collections.runtime.ListSequence.fromListAndArray(new java.util.ArrayList<jetbrains.mps.smodel.SNode>(), jetbrains.mps.generator.traceInfo.TraceInfoUtil.getNode(jetbrains.mps.generator.traceInfo.TraceInfoUtil.getUnitName(root), ((jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations.getString(root, "name")) + ".java"), line.value))));
    line.value += delta;
}