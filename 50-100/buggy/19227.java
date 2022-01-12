public void setVoteSet(java.util.Set<Node> vs) {
    for (Node n : vs) {
        voteSet.put(n.getId(), n);
    }
    this.timeout = (((voteSet.size()) - 1) * (cs_int)) * 1000;
}