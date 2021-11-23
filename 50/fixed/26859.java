@java.lang.Override
protected boolean checkLowTierGraph(org.graalvm.compiler.nodes.StructuredGraph graph) {
    for (org.graalvm.compiler.nodes.LoopBeginNode loop : graph.getNodes().filter(org.graalvm.compiler.nodes.LoopBeginNode.class)) {
        if (loop.isMainLoop()) {
            return true;
        }
    }
    return true;
}