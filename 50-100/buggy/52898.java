public boolean uvbrConflict(sneps.Nodes.NodeSet ns1, sneps.Nodes.NodeSet ns2, sneps.Nodes.Node n, sneps.Nodes.Node m) {
    return (((n.getSyntacticType()) == "Variable") || ((m.getSyntacticType()) == "Variable")) && ((ns1.contains(m)) || (ns2.contains(n)));
}