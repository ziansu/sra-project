public Point nextPosition(WorldModel world, Point dest_pt) {
    Point start_pt = this.getPosition();
    java.util.List<Node> path = AStar(world, world.getTileOccupant(dest_pt).getClass(), start_pt, dest_pt);
    if (!(path.isEmpty()))
        return path.get(1).pt;
    else
        return start_pt;
    
}