public synchronized void setMap(java.util.Map m) {
    fruitEditor.setMap(m);
    map = m;
    mapWidth = m.getCols();
    mapHeight = m.getRows();
    gridWidth = m.getGridWidth();
    gridHeight = m.getGridHeight();
    update();
}