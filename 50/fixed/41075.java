public void remove(T o) {
    int index = list.indexOf(o);
    if (index >= 0) {
        remove(index);
    }
}