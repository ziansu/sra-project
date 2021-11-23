public void forceRedraw() {
    cacheSize = null;
    cache = new java.util.WeakHashMap<>();
    fireEvent(ListDataEvent.CONTENTS_CHANGED, 0, getSize());
}