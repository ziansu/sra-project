public void write(byte[] data) {
    int index = 0;
    while (index < (clientCount)) {
        if (clients[index].active()) {
            clients[index].write(data);
            index++;
        }else {
            removeIndex(index);
        }
    } 
}