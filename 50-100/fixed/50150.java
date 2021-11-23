public trees.rstartree.Node overflowTreatment(int level, trees.rstartree.Node node, trees.rstartree.Node newNode) {
    trees.rstartree.Node nn = null;
    if ((level != 0) && (!(overflowsDone.get(level)))) {
        overflowsDone.set(level, true);
        reInsert(node, newNode, level);
    }else {
        nn = node.splitNode(newNode);
    }
    return nn;
}