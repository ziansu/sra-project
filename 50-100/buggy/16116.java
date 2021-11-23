protected void deleteFromLocationTree(org.rajawali3d.math.vector.Vector3 location) {
    double[] loc = asteroids3d.gamestate.objects.Asteroids.AsteroidManager.vectorToArray(location);
    edu.wlu.cs.levy.CG.KDTree tree = getAsteroidLocationMap();
    asteroids3d.gamestate.objects.Asteroids.Asteroid ast = null;
    try {
        int size = tree.size();
        tree.delete(loc);
        assert (tree.size()) == (size - 1);
    } catch (edu.wlu.cs.levy.CG.KeySizeException | edu.wlu.cs.levy.CG.KeyMissingException e) {
        e.printStackTrace();
    }
}