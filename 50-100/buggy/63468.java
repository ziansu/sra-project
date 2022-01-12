public napakalaki.Monster nextMonster() {
    if (unusedMonster.isEmpty()) {
        unusedMonster = usedMonster;
        shuffleMonster();
        usedMonster.clear();
    }
    napakalaki.Monster salida;
    salida = unusedMonster.get(0);
    unusedMonster.remove(0);
    return salida;
}