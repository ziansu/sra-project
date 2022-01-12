public haven.Coord parentpos(haven.Widget in) {
    if (in == (this))
        return new haven.Coord(0, 0);
    
    return parent.xlate(parent.parentpos(in).add(c), true);
}