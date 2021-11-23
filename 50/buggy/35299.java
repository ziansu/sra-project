public void update(double deltaTime) {
    this.deltaTime = deltaTime;
    getTime();
    updateCars(deltaTime);
    releaseCars();
    checkCollisions();
    updateObjects(deltaTime);
    checkLaps();
}