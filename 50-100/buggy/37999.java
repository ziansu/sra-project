void setNewMonster() {
    com.example.sauronsarmy.oopp.monsterPack.monsterFactory monFac = new com.example.sauronsarmy.oopp.monsterPack.monsterFactory();
    if (!((pathToGoal) == 9)) {
        setCurrentMonster(monFac.getMonster(((getHealthMultiplier()) * 100), ((getGoldMultiplier()) * 100), getArea()));
    }else {
        setCurrentMonster(monFac.getBossMonster(((getHealthMultiplier()) * 10000), ((getGoldMultiplier()) * 1000), getArea()));
    }
}