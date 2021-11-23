public E peek() {
    if ((list.size()) == 0) {
        return null;
    }
    return list.get(((size()) - 1));
}