public entity.Wall getWallOn(int x, int y) {
    for (entity.Entity e : hardEntities) {
        if (((e instanceof entity.Wall) && ((e.getX()) == x)) && ((e.getY()) == y))
            return ((entity.Wall) (e));
        
    }
    return null;
}