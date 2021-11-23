public void append(java.lang.String log) {
    MerkleTree current = tree;
    tree.hash = auxAppend(log, current);
}