public void addThread(int ID) {
    if (!(sendThreadList.contains(ID))) {
        sendThreadList.remove(ID);
    }
}