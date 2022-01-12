private java.util.Set<T> getMembers(io.acoia.sets.UnionFind<T>.UnionFindEntry entry) {
    java.util.Set<T> result = new java.util.HashSet<>(entry.size);
    while (entry != null) {
        result.add(entry.entry);
        entry = entry.next;
    } 
    return result;
}