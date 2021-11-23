public Coord getClosestTrap(Coord pos) {
    if (!(traps.isEmpty())) {
        Trap tmp = traps.get(0);
        for (Trap x : traps) {
            if ((Coord.distance(pos, tmp.getPos())) > (Coord.distance(pos, x.getPos()))) {
                tmp = x;
            }
        }
        return tmp.getPos();
    }
    return null;
}