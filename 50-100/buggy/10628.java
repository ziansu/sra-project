public void setSize(final java.lang.Long size) {
    if ((getPrev()) != 0) {
        final java.lang.Long prevSize = getObject().getIntegerKey(ASAtom.SIZE);
        if (prevSize > size) {
            return ;
        }
    }
    getObject().setIntegerKey(ASAtom.SIZE, size);
}