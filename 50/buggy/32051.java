public List<byte[]> genPath(int index) {
    MerkleTree current = tree;
    List<byte[]> listHash = new List<byte[]>();
    makePath(index, current, listHash);
    return listHash;
}