@java.lang.Override
protected boolean removeEldestEntry(final java.util.Map.Entry<A, B> eldest) {
    java.lang.System.out.println("too many items, remove item...");
    return (super.size()) > (maxEntries);
}