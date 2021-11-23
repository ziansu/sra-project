public void shiftPetsRight() {
    petLock.lock();
    try {
        if ((pets[2]) == null) {
            pets[2] = pets[1];
            pets[1] = pets[0];
            pets[0] = null;
        }
    } finally {
        petLock.unlock();
    }
}