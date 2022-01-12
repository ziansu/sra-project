public models.Unit getUnitById(int id) {
    if ((gameScreen) == null) {
        java.lang.System.out.println("Gamescreen = null");
        return null;
    }
    java.util.ArrayList<models.Unit> units = gameScreen.getUnits();
    for (models.Unit u : units) {
        if ((u.getId()) == id) {
            return u;
        }
    }
    return null;
}