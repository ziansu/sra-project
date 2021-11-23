public void updateAStar() {
    Room.aStarMap = new int[aStarMapHeight][aStarMapWidth];
    for (Enemy e : getGameWorld().getCurrentRoom().getEnemyList()) {
        addObstruction(e.getBoundingBox());
    }
    for (Item i : getGameWorld().getCurrentRoom().getItemList()) {
        addObstruction(i.getBoundingBox());
    }
    addObstruction(getGameWorld().getPlayer().getBoundingBox());
}