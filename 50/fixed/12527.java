public void forceRedraw() {
    cacheSize = null;
    cache = null;
    fireEvent(ListDataEvent.CONTENTS_CHANGED, 0, getSize());
}