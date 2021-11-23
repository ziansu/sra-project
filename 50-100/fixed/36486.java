public void deleteAsteroid(asteroids3d.gamestate.objects.Asteroids.Asteroid asteroid) {
    getCurrentScene().removeChild(asteroid.getShape());
    org.rajawali3d.util.RajLog.i(("Before asteroid delete:" + (asteroids.size())));
    this.asteroids.remove(asteroid);
    org.rajawali3d.util.RajLog.i(("After asteroid delete:" + (asteroids.size())));
}