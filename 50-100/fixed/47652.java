public void shiftPetsRight() {
    petLock.lock();
    try {
        if ((pets[((pets.length) - 1)]) == null) {
            for (int i = (pets.length) - 1; i >= 0; i++) {
                pets[i] = pets[(i - 1)];
            }
            pets[0] = null;
        }
    } finally {
        petLock.unlock();
    }
}