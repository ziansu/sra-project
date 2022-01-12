public void write(java.lang.String data) {
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