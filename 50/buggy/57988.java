public K pop() {
    if ((size()) > 0) {
        return remove(((size()) - 1));
    }else {
        return null;
    }
}