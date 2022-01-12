private void deleteCase2(final kuvaldis.algorithm.structure.BTreeSet.Node node, final int level, final int deletePosition) {
    if ((level == ((height) - 1)) && ((node.length) <= ((kuvaldis.algorithm.structure.BTreeSet.M) / 2))) {
        deleteCase2a(node, deletePosition);
    }else {
        deleteCase3(node, level, deletePosition);
    }
}