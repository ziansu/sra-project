java.util.Map<java.lang.String, com.googlecode.d2j.node.DexClassNode> readDex(java.lang.String path) throws java.io.IOException {
    com.googlecode.d2j.reader.DexFileReader dexFileReader = new com.googlecode.d2j.reader.DexFileReader(com.googlecode.d2j.reader.zip.ZipUtil.readDex(new java.io.File(path)));
    com.googlecode.d2j.node.DexFileNode dexFileNode = new com.googlecode.d2j.node.DexFileNode();
    dexFileReader.accept(dexFileNode);
    java.util.Map<java.lang.String, com.googlecode.d2j.node.DexClassNode> map = new java.util.HashMap<>();
    for (com.googlecode.d2j.node.DexClassNode c : dexFileNode.clzs) {
        map.put(c.className, c);
    }
    return map;
}