private static boolean collides(int x, int y, int width, int height, com.polarbirds.huldra.model.world.SectionBounds bounds, java.lang.Iterable<com.polarbirds.huldra.model.world.SectionBounds> boundsList) {
    for (com.polarbirds.huldra.model.world.SectionBounds boundsFromList : boundsList) {
        if (bounds.collides(x, y, width, height)) {
            return true;
        }
    }
    return false;
}