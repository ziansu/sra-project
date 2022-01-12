public napakalaki.Monster nextMonster() {
    if (unusedMonster.isEmpty()) {
        unusedMonster = usedMonster;
        shuffleMonster();
        usedMonster.clear();
    }
    napakalaki.Monster salida;
    salida = unusedMonster.get(((unusedMonster.size()) - 1));
    unusedMonster.remove(((unusedMonster.size()) - 1));
    return salida;
}