public int get_o_y(haven.Coord pc, haven.Coord tar, int turn_x) {
    return (((turn_x - (pc.x)) * ((pc.x) - (tar.x))) / ((tar.y) - (pc.y))) + (pc.y);
}