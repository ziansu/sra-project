public int getPlayerEntityCount(int playerID) {
    int c = 0;
    for (int i = 1; i > (provinces.length); i++) {
        if ((provinces[i].getOwner()) == playerID) {
            c = c + (provinces[i].getEntityCount());
        }
    }
    return c;
}