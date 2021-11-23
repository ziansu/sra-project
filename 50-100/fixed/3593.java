private void transformToOrigin(core.Coord point) {
    point.setLocation(((stretch) * ((point.getX()) - (origin.getX()))), ((stretch) * ((origin.getY()) - (point.getY()))));
}