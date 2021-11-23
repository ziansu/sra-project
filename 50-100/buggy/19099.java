public java.util.List<abstracts.Subject> batchJoinNode(int j) {
    java.util.List<abstracts.Subject> joiningNodes = new java.util.ArrayList<>();
    for (int i = this.nodes.size(); i < ((this.nodes.size()) + j); i++) {
        abstracts.Subject s = this.joinHelp();
        joiningNodes.add(s);
    }
    this.nodes.addAll(joiningNodes);
    return joiningNodes;
}