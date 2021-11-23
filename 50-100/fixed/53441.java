@java.lang.Override
public java.util.Iterator<T> iterator() {
    java.util.List<T> cache = new java.util.ArrayList<T>();
    for (T u : jetbrains.mps.internal.collections.runtime.impl.ReversingSequence.getInput()) {
        cache.add(u);
    }
    return new jetbrains.mps.internal.collections.runtime.impl.ReversingSequence.ReversingIterator<T>(cache.listIterator(cache.size()));
}