private static objects.world.ItemType keyIDtoItemType(int keyID) {
    if ((keyID < 0) || (keyID >= 4)) {
        keyID = 1;
    }
    int n = (keyID - 1) + (ItemType.YELLOW_LOCK.ordinal());
    return objects.world.ItemType.values()[n];
}