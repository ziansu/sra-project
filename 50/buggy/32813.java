public void moveLocationForPosition(edu.brown.cs.sjl2.ctrl_alt_defeat.basketball.BasketballPosition pos, edu.brown.cs.sjl2.ctrl_alt_defeat.Location loc, double time) {
    edu.brown.cs.sjl2.ctrl_alt_defeat.playmaker.Path p = paths.get(pos);
    p.moveLocationAtIndex(loc, index);
}