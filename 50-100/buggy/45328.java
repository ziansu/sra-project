public byte getPetIndex(int petId) {
    petLock.lock();
    try {
        for (byte i = 0; i < 3; i++) {
            if ((pets[i]) != null) {
                if ((pets[i].getUniqueId()) == petId) {
                    return i;
                }
            }
        }
        return -1;
    } finally {
        petLock.unlock();
    }
}