public void resize(haven.Coord nsz) {
    super.resize(nsz);
    bar.c = new haven.Coord(((sz.x) - (bar.sz.x)), 0);
    cont.resize(sz.sub(bar.sz.x, 0));
}