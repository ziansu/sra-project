public void update(double deltaTime) {
    this.deltaTime = deltaTime;
    time = getTime();
    updateCars(deltaTime);
    releaseCars();
    checkCollisions();
    updateObjects(deltaTime);
    checkLaps();
}