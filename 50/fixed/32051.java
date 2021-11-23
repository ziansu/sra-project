public java.util.List<byte[]> genPath(int index) {
    MerkleTree current = tree;
    java.util.List<byte[]> listHash = new java.util.LinkedList();
    return makePath(index, current, listHash);
}