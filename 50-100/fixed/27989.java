public byte getPetIndex(client.inventory.MaplePet pet) {
    petLock.lock();
    try {
        for (byte i = 0; i < (pets.length); i++) {
            if ((pets[i]) != null) {
                if ((pets[i].getUniqueId()) == (pet.getUniqueId())) {
                    return i;
                }
            }
        }
        return -1;
    } finally {
        petLock.unlock();
    }
}