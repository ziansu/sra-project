public static datastructure.Node findSubInCache(java.util.List<datastructure.Node> tree, datastructure.Node n) {
    for (datastructure.Node curr : tree) {
        boolean conclusion = n.conclusion.equals(curr.conclusion);
        boolean hypotheses = (n.hypotheses.containsAll(curr.hypotheses)) && (curr.hypotheses.containsAll(n.hypotheses));
        if (conclusion && hypotheses) {
            return curr;
        }
    }
    return null;
}