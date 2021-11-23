@java.lang.Override
public java.lang.String createTable(org.poormanscastle.studies.compilers.utils.grammartools.Grammar grammarArg) {
    org.poormanscastle.studies.compilers.utils.grammartools.lr.LR0Grammar grammar = ((org.poormanscastle.studies.compilers.utils.grammartools.lr.LR0Grammar) (grammarArg));
    java.lang.StringBuilder output = new java.lang.StringBuilder("digraph LR0StateMachine {\n");
    output.append("\nnode [shape = rectangle]\n");
    for (org.poormanscastle.studies.compilers.utils.grammartools.lr.LRState state : grammar.getStates()) {
        output.append(createDotNodeFromLRState(state));
    }
    for (org.poormanscastle.studies.compilers.utils.grammartools.lr.LREdge edge : grammar.getEdges()) {
        output.append(createDotEdgeFromLREdge(edge));
    }
    output.append("}\n");
    return output.toString();
}