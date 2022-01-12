public entity.Wall getWallOn(int x, int y) {
    for (entity.Entity e : hardEntities) {
        if ((((e.getX()) == x) && ((e.getY()) == y)) && (e instanceof entity.Wall))
            return ((entity.Wall) (e));
        
    }
    return null;
}