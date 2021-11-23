private void symbolTableToHash() {
    java.util.HashMap<java.lang.Integer, dataStructures.Node> symbolTableAsHash = new java.util.HashMap<java.lang.Integer, dataStructures.Node>();
    addHashEntry(this.getRoot(), symbolTableAsHash);
    this.symbolTableAsHash = symbolTableAsHash;
}