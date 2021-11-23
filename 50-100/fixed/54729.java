public int get_o_y(haven.Coord pc, haven.Coord tar, int turn_x) {
    if (((tar.y) - (pc.y)) == 0) {
        return pc.y;
    }
    return (((turn_x - (pc.x)) * ((pc.x) - (tar.x))) / ((tar.y) - (pc.y))) + (pc.y);
}