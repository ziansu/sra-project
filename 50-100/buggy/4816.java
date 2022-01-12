public void hunt(ypmf.Creature target) {
    java.util.List<ypmf.Point> points = new ypmf.Path(creature, target.x, target.y).points();
    int mx = (points.get(0).x) - (creature.x);
    int my = (points.get(0).y) - (creature.y);
    creature.moveBy(mx, my, 0);
}