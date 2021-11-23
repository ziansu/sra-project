public void remove(int index) {
    typenames.remove(index);
    listeners.remove(index);
    length = (length) - 1;
}