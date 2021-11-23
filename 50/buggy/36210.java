public void add(java.lang.String element) {
    if ((queue.size()) == (size)) {
        queue.removeFirst();
    }
    queue.addLast(element);
}