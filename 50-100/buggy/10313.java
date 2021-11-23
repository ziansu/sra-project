public int getNextEmptyPetIndex() {
    petLock.lock();
    try {
        for (int i = 0; i < (pets.length); i++) {
            if ((pets[i]) == null) {
                return i;
            }
        }
        return 3;
    } finally {
        petLock.unlock();
    }
}