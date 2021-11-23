public void findPath(int x, int y) {
    pathArray = entity.mobs.ai.path.Path.findPath(mob, x, y, canOpenDoors);
    pathArray.remove(0);
}