public void addIfAbsent(E e) {
    markAsStale();
    underlyingList.addIfAbsent(e);
}