public E poll() {
    if ((this.size) == 0) {
        return null;
    }
    E tmp = array[0];
    array[0] = array[(--(this.size))];
    array[this.size] = tmp;
    percolateDn(0);
    return tmp;
}