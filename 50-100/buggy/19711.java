public E poll() {
    if (((size)--) == 0) {
        return null;
    }
    E tmp = array[0];
    array[0] = array[size];
    array[size] = tmp;
    percolateDn(0);
    return tmp;
}