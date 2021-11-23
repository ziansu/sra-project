private boolean isContainedInScope(microbat.model.trace.TraceNode node, microbat.model.Scope conditionScope) {
    java.util.List<microbat.model.trace.TraceNode> testingSet = new java.util.ArrayList<>();
    testingSet.add(node);
    java.util.List<microbat.model.trace.TraceNode> invocationParents = node.findAllInvocationParents();
    testingSet.addAll(invocationParents);
    for (microbat.model.trace.TraceNode n : testingSet) {
        if (conditionScope.containsNodeScope(n)) {
            return true;
        }
    }
    return false;
}