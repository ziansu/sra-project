public void write(byte[] data) {
    int index = 0;
    while (index < (clientCount)) {
        clients[index].write(data);
        if (clients[index].active()) {
            index++;
        }else {
            removeIndex(index);
        }
    } 
}