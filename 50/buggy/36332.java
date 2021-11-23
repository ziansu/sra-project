public void insertElement(T element) {
    if ((queue.size()) > (size)) {
        queue.remove(0);
    }
    queue.add(element);
}