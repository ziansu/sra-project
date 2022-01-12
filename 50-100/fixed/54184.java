public void write(java.lang.String data) {
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