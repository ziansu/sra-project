public void put(long key, int val) {
    long newKey = put(root, key, val);
    reassignRoot(newKey);
    rootIsSet = true;
    keyColorMap.put(root, 1);
}