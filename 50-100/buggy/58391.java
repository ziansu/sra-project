public MaRzAgent.SuffixNode findWorstNodeToTry() {
    MaRzAgent.SuffixNode[] nodes = ((MaRzAgent.SuffixNode[]) (hashFringe.values().toArray()));
    assert (nodes.length) > 0;
    double theBEASTLIESTCombo = nodes[0].heuristic;
    MaRzAgent.SuffixNode worstNode = nodes[0];
    for (MaRzAgent.SuffixNode node : nodes) {
        if ((node.heuristic) < theBEASTLIESTCombo) {
            theBEASTLIESTCombo = node.heuristic;
            worstNode = node;
        }
    }
    return worstNode;
}