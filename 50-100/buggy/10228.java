public void advanceTime(double timeElapsed) throws java.lang.IllegalArgumentException, jumpingalien.model.IllegalPositionException, jumpingalien.model.IllegalTimeException {
    if (java.lang.Double.isNaN(timeElapsed))
        throw new java.lang.IllegalArgumentException("The elapsed time must be a number.");
    
    updateCollisionTimers(getAlien(), timeElapsed);
    getAlien().advanceTime(timeElapsed);
    centerWindow(timeElapsed);
    alienObjectCollisionEffects();
    geoCollisionEffects(getAlien());
    for (jumpingalien.model.GameObject gameobject : this.gameobjects) {
        updateCollisionTimers(gameobject, timeElapsed);
        gameobject.advanceTime(timeElapsed);
    }
}