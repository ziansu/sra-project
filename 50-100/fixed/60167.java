public void clearEnemies() {
    for (int i = 0; i < (object.size()); i++) {
        com.tutorial.main.GameObject tempObject = object.get(i);
        if ((tempObject.getID()) != (ID.Player)) {
            removeObject(tempObject);
            i--;
        }else {
            if ((Game.gameState) == (Game.STATE.End)) {
                removeObject(tempObject);
                i--;
            }
        }
    }
}