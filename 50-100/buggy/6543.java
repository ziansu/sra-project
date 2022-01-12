public static java.util.List<java.util.List<java.lang.Integer>> findSomeTrace(java.util.List<java.lang.Integer> target, common.finiteautomata.Automata from, common.bellmanford.EdgeWeightedDigraph function) {
    final java.util.List<java.util.List<java.lang.Integer>> trace = new java.util.ArrayList<>();
    final common.finiteautomata.Automata init = common.finiteautomata.AutomataUtility.getWordAutomaton(from, target.size());
    final boolean isFound = common.VerificationUtility.findSomeTraceHelper(init, function, target, trace);
    return isFound ? trace : null;
}