private me.ihaq.pacman.menu.Game.FACING newDirection() {
    me.ihaq.pacman.utils.Intersection i = getCollidingIntersection();
    int newMove = new java.util.Random().nextInt(((i.getDirections().size()) - 1));
    return i.getDirections().get(newMove);
}