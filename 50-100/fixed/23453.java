@java.lang.Override
public void update() {
    if (ageUpdateDelay.check()) {
        long curPlanetAge = planet.surface.Surface.planetAge.getAndAdd(planet.surface.Surface.ageStep);
        if ((curPlanetAge - (geologicalTimeStamp)) > (planet.surface.Surface.GEOUPDATE)) {
            geologicalTimeStamp = curPlanetAge;
        }
    }
    if ((display) != null) {
        display.update();
    }
    if (threadAverageDelay.check()) {
        super.update();
    }
}