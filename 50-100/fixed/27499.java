public ontologizer.types.ByteString[] buildReverseArrayMapping(java.util.Map<ontologizer.types.ByteString, java.lang.Integer> item2index) {
    ontologizer.types.ByteString[] bs = new ontologizer.types.ByteString[item2index.size()];
    for (java.util.Map.Entry<ontologizer.types.ByteString, java.lang.Integer> e : item2index.entrySet()) {
        bs[e.getValue()] = e.getKey();
    }
    for (int i = 0; i < (bs.length); i++) {
        assert (bs[i]) != null;
    }
    return bs;
}