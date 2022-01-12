public main.Tile spawnBlock() {
    java.util.Random rand = new java.util.Random();
    int x = rand.nextInt(7);
    switch (x) {
        case 0 :
            return spawnJBlock();
        case 1 :
            return spawnIBlock();
        case 2 :
            return spawnLBlock();
        case 3 :
            return spawnSBlock();
        case 4 :
            return spawnTBlock();
        case 5 :
            return spawnZBlock();
        case 6 :
            return spawnOBlock();
    }
    return null;
}