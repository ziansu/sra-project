public void put(com.inursoft.Automata.Point p, int value) {
    if ((p.getX()) > (width)) {
        width = (p.getX()) + 1;
    }
    if ((p.getY()) > (height)) {
        height = (p.getY()) + 1;
    }
    worldMap.put(p, value);
}