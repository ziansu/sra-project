private static boolean collides(int x, int y, int width, int height, java.lang.Iterable<com.polarbirds.huldra.model.world.SectionBounds> boundsList) {
    for (com.polarbirds.huldra.model.world.SectionBounds boundsFromList : boundsList) {
        if (boundsFromList.collides(x, y, width, height)) {
            return true;
        }
    }
    return false;
}