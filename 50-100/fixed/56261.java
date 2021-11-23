public void turn_around(haven.Coord tar_rc, int direction) {
    haven.Coord pc = player().rc;
    int turn_x = (pc.x) + (20 * direction);
    haven.Coord target_rc = new haven.Coord(turn_x, get_o_y(pc, tar_rc, turn_x));
    ui.gui.map.wdgmsg("click", getCenterScreenCoord(), target_rc, 1, 0);
}