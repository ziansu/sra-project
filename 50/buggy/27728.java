private boolean ReadMembers(com.brettonw.bag.BagObject bagObject) {
    return (ReadPair(bagObject)) && (((Expect(',')) && (ReadMembers(bagObject))) || true);
}