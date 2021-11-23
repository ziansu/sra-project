public void add(E e) {
    if ((queue.size()) < (maxSize)) {
        queue.add(e);
    }else {
        E peek = queue.peek();
        if ((e.compareTo(peek)) > 0) {
            queue.poll();
            queue.add(e);
        }
    }
}