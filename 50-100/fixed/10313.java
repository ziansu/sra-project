public int getNextEmptyPetIndex() {
    petLock.lock();
    try {
        for (int i = 0; i < 3; i++) {
            if ((pets[i]) == null) {
                return i;
            }
        }
        return 3;
    } finally {
        petLock.unlock();
    }
}