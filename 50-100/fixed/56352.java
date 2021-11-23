public int findNextRight() {
    int index = 0;
    synchronized(otherClients) {
        for (ClientTuple client : otherClients) {
            if ((client.getNum()) > (myNum)) {
                return index;
            }else {
                index++;
            }
        }
        return -1;
    }
}