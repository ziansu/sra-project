public napakalaki.Treasure nextTreasure() {
    if (unusedTreasures.isEmpty()) {
        unusedTreasures = usedTreasures;
        shuffleTreasure();
        usedTreasures.clear();
    }
    napakalaki.Treasure salida = unusedTreasures.get(((unusedTreasures.size()) - 1));
    unusedTreasures.remove(((unusedTreasures.size()) - 1));
    return salida;
}