public void put(com.inursoft.Automata.Point p, int value) {
    if (value == 0) {
        worldMap.remove(p);
        return ;
    }
    if ((p.getX()) > (width)) {
        width = p.getX();
    }
    if ((p.getY()) > (height)) {
        height = p.getY();
    }
    worldMap.put(p, value);
}