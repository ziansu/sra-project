public int findNextLeft() {
    for (int i = (otherClients.size()) - 1; i >= 0; i--) {
        if ((otherClients.get(i).getNum()) < (myNum)) {
            return i;
        }
    }
    return -1;
}