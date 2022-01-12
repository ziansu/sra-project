public napakalaki.Treasure nextTreasure() {
    if (unusedTreasures.isEmpty()) {
        unusedTreasures = usedTreasures;
        shuffleTreasure();
        usedTreasures.clear();
    }
    napakalaki.Treasure salida = unusedTreasures.get(0);
    unusedTreasures.remove(0);
    return salida;
}