public com.brettonw.bag.BagObject append(java.lang.String key, java.lang.Object object) {
    com.brettonw.bag.Pair pair = getOrAddPair(key);
    com.brettonw.bag.BagArray bagArray = ((com.brettonw.bag.BagArray) (pair.getValue()));
    if (bagArray == null) {
        pair.setValue((bagArray = new com.brettonw.bag.BagArray()));
    }
    bagArray.add(com.brettonw.bag.BagHelper.objectify(object));
    return this;
}