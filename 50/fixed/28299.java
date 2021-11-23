public T next() {
    if (hasNext()) {
        return queue.remove();
    }else {
        return null;
    }
}