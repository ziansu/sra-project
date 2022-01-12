public java.util.Iterator<E> minimumSpanningTree() {
    java.util.Set<E> set = new java.util.HashSet<E>();
    for (E e = pq.poll(); !(pq.isEmpty()); e = pq.poll()) {
        set.add(e);
        if (checkForCycle(set, e.getSource(), e.getDest())) {
            set.remove(e);
        }
    }
    return set.iterator();
}