public void addPet(client.inventory.MaplePet pet) {
    petLock.lock();
    try {
        for (int i = 0; i < 3; i++) {
            if ((pets[i]) == null) {
                pets[i] = pet;
                return ;
            }
        }
    } finally {
        petLock.unlock();
    }
}