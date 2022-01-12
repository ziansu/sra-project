public void deleteFirst() {
    if ((root) != null) {
        root = root.next;
        (this.length)--;
    }
}