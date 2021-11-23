public int isFull() {
    for (int i = 0; i < 10; i++) {
        if (!(this.channels.get(i).isReserved())) {
            return i;
        }
    }
    return -1;
}