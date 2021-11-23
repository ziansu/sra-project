public E pop() {
    if ((list.size()) == 0) {
        return null;
    }
    (size)--;
    return list.remove(((list.size()) - 1));
}