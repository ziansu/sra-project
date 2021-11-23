protected void rollTheMonster() {
    if ((monster) != null) {
        return ;
    }
    if ((java.lang.Math.random()) > (com.utype.locations.Location.MONSTER_ENCOUNTER_PROBABILITY)) {
        monster = com.utype.characters.Monster.getRandomMonster();
        monster.setListener(this);
        return ;
    }
    startPuzzleIfNeeded();
}