public void put(long key, int val) {
    root = put(root, key, val);
    rootIsSet = true;
    keyColorMap.put(root, thirdparty.edu.princeton.cs.algs4.RedBlackBSTLongInt2.BLACK);
    if (keyParentMap.containsKey(root)) {
        keyParentMap.remove(root);
    }
    assert check();
}