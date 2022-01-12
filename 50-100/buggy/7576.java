public boolean monsterExist(game.zork.Monster monster) {
    java.util.Map<game.zork.GameMap.Coordination, java.util.ArrayList<java.lang.Object>> mapLevel = getLevelMap();
    game.zork.GameMap.Coordination currentPosition = getCurrentPosition();
    for (java.lang.Object i : mapLevel.get(currentPosition)) {
        if ((i instanceof game.zork.Monster) && ((((game.zork.Monster) (i)).getName()) == (monster.getName()))) {
            return true;
        }
    }
    return false;
}