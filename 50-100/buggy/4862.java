public static void removeTower(int x, int y) {
    java.util.Iterator<de.clemens_hartmann.checkpoint.core.Tower> iter = de.clemens_hartmann.checkpoint.core.TowerManager.towers.iterator();
    while (iter.hasNext()) {
        de.clemens_hartmann.checkpoint.core.Tower tower = iter.next();
        if (((tower.getX()) == x) && ((tower.getY()) == y))
            tower.dispose();
        
        iter.remove();
    } 
}