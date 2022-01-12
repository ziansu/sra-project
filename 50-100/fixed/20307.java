public void play(softgroup.ua.api.Automat automat) {
    java.util.Random random = new java.util.Random();
    int slot1 = random.nextInt(SLOT3);
    int slot2 = random.nextInt(SLOT3);
    int slot3 = random.nextInt(SLOT3);
    automat.slots.add(slot1);
    automat.slots.add(slot2);
    automat.slots.add(slot3);
    automat.isWon = (slot1 == slot2) && (slot1 == slot3);
}