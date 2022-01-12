public boolean destroyBuilding() {
    if (building.isEmpty()) {
        java.lang.System.out.println("Kein Geb�ude Vorhanden");
        return false;
    }
    int index = (building.size()) - 1;
    gameUC.Building b = building.get(index);
    building.remove(index);
    freeSlots += b.needSlots();
    return true;
}