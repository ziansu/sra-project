protected void deleteFromLocationTree(org.rajawali3d.math.vector.Vector3 location) {
    double[] loc = asteroids3d.gamestate.objects.Asteroids.AsteroidManager.vectorToArray(location);
    edu.wlu.cs.levy.CG.KDTree<asteroids3d.gamestate.objects.Asteroids.Asteroid> tree = getAsteroidLocationMap();
    try {
        tree.delete(loc);
    } catch (edu.wlu.cs.levy.CG.KeySizeException | edu.wlu.cs.levy.CG.KeyMissingException e) {
        e.printStackTrace();
    }
}