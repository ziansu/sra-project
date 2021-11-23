public void delete() {
    if ((current) != null) {
        if ((current.prev) != null) {
            current.prev.next = current.next;
        }
        if ((current.next) != null) {
            current.next.prev = current.prev;
        }
        current = null;
        (nextCount)--;
    }
}