private int findClient(android.os.IBinder token) {
    for (int i = 0; i < (mClients.size()); i++) {
        if ((mClients.get(i).mToken) == token) {
            return i;
        }
    }
    return -1;
}