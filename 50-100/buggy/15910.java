public int getNoPets() {
    petLock.lock();
    try {
        int ret = 0;
        for (int i = 0; i < 3; i++) {
            if ((pets[i]) != null) {
                ret++;
            }
        }
        return ret;
    } finally {
        petLock.unlock();
    }
}