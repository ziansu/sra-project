public com.brettonw.bag.BagObject ReadBagObject() {
    com.brettonw.bag.BagObject bagObject = new com.brettonw.bag.BagObject();
    return ((Expect('{')) && (ReadMembers(bagObject, true))) && (Expect('}')) ? bagObject : null;
}