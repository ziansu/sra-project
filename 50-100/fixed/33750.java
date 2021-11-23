public java.util.ArrayList<tatics.Path> startFind(tatics.Unit u) {
    paths = new java.util.ArrayList<tatics.Path>();
    orgX = u.getX();
    orgY = u.getY();
    findPath(u.getX(), u.getY(), u.getMove(), new tatics.Path());
    return paths;
}