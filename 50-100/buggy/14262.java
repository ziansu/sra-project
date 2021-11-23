public MaRzAgent.SuffixNode findBestNodeToTry() {
    MaRzAgent.SuffixNode[] nodes = ((MaRzAgent.SuffixNode[]) (hashFringe.values().toArray(new MaRzAgent.SuffixNode[hashFringe.size()])));
    assert (nodes.length) > 0;
    double theBEASTLIESTCombo = nodes[0].heuristic;
    MaRzAgent.SuffixNode bestNode = nodes[0];
    for (MaRzAgent.SuffixNode node : nodes) {
        if ((node.heuristic) > theBEASTLIESTCombo) {
            theBEASTLIESTCombo = node.heuristic;
            bestNode = node;
        }
    }
    return bestNode;
}