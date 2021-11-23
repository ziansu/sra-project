static int getMax(de.hsma.ss16.oot.oware.DrawTreeNode node) {
    int max = node.getCatched();
    int tmpMax = 0;
    for (de.hsma.ss16.oot.oware.DrawTreeNode subNode : node.getNodes()) {
        if (subNode != null) {
            int minmax = subNode.getMax();
            if (minmax > tmpMax) {
                tmpMax = subNode.getMax();
            }
        }
    }
    return max + tmpMax;
}