public int findNextRight() {
    int index = 0;
    for (ClientTuple client : otherClients) {
        if ((client.getNum()) > (myNum)) {
            return index;
        }else {
            index++;
        }
    }
    return -1;
}